/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_ud5_ed;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author violi
 */
public class Ejercicio4UD5ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso = new Curso("Matemáticas");

        Alumno alumno1 = new Alumno("Juan", 20, "A001");
        Alumno alumno2 = new Alumno("María", 21, "A002");

        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);

        System.out.println("Lista de alumnos matriculados en el curso de " + curso.getNombre() + ":");
        List<Alumno> alumnos = curso.getAlumnos();
        Iterator<Alumno> iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            Alumno alumno = iterator.next();
            System.out.println(
                "Nombre: " + alumno.getNombre() + 
                ", Edad: " + alumno.getEdad() + 
                ", Código: " + alumno.getCodigo()
            );
        }
    }
    
}
