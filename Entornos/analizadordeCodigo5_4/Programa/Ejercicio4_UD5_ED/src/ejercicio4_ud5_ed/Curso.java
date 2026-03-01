/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_ud5_ed;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author violi
 */
public class Curso {
    private String nombre;
    private List<Alumno> alumnos;

    public Curso(String nombre){
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos(){
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos){
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno){
        alumnos.remove(alumno);
    }
    
    public double calcularEdadPromedio() {
        if (alumnos.size() == 0) {
            return 0;
        }

        int sumaEdades = 0;

        for (Alumno alumno : alumnos) {
            sumaEdades += alumno.getEdad();
        }

        return (double) sumaEdades / alumnos.size();
    }
    
    // Función para mostrar la edad promedio de los alumnos matriculados
    public void mostrarEdadPromedioCurso() {
        double edadPromedio = calcularEdadPromedio();
        System.out.println("La edad promedio de los alumnos en el curso de " 
                           + nombre + " es: " + edadPromedio);
    }
}
