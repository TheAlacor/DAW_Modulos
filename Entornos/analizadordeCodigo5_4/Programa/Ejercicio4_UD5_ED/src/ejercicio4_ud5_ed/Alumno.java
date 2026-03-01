package ejercicio4_ud5_ed;

import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author violi
 */
public class Alumno {
    private String nombre;
    private int edad;
    private String codigo;

    
    public Alumno(String nombre, int edad, String codigo){
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getCodigo(){
        return codigo;
    }

    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    
    public void setEdad(int edad){
        this.edad = edad;
    }

    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    
    // Función para calcular la edad promedio de un grupo de alumnos
    //quitado y cambiado a curso
}
