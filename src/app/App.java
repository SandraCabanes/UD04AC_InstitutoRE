/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import conexion.AlumnoDao;
import conexion.ProfesorDao;
import java.util.Calendar;
import model.Alumno;
import model.Profesor;

/**
 *
 * @author Sandra
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoDao alumDAO = new AlumnoDao();
        ProfesorDao profDAO = new ProfesorDao();
        //Alta
        Alumno a = new Alumno(25, "Francisco", 20, 'S', Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), "Hola");
        alumDAO.altaAlumno(a);
        System.out.println("Dado de alta");

        
        Profesor p = new Profesor("Pepe", "Garcia", "Lopez");
        profDAO.altaProfesor(p);
        System.out.println("Dado de alta");
        
        //Consulta
        Alumno a2 = alumDAO.obtenerAlumno(2);
        System.out.println("Código: "+a2.getId());
        System.out.println("Nombre: "+a2.getNombre());
        
        Profesor p2 = profDAO.obtenerProfesor(2);
        System.out.println("Nombre: "+p2.getNombre());
        System.out.println("Apellidos: "+p2.getApe1()+" "+p2.getApe2());
        
        //Baja
        Alumno a3 = new Alumno();
        a.setId(20);
        alumDAO.bajaAlumno(a);
        System.out.println("Borrado.");
        
        Profesor p3 = new Profesor();
        p.setId(5);
        profDAO.bajaProfesor(p);
        System.out.println("Borrado.");

    }

}
