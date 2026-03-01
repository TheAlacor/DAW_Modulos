/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa un estudiante.
 * Permite almacenar y gestionar el nombre y la edad de un estudiante.
 *
 * @author Álvaro
 * @version 1.0
 * @since 1.0
 */
public class Estudiante {

    /**
     * Nombre del estudiante.
     */
    private String nombre;

    /**
     * Edad del estudiante.
     */
    private int edad;

    /**
     * Constructor de la clase Estudiante.
     * Inicializa el nombre y la edad del estudiante.
     *
     * @param nombre Nombre del estudiante.
     * @param edad Edad del estudiante.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return Nombre actual del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del estudiante.
     *
     * @param nombre Nuevo nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del estudiante.
     *
     * @return Edad actual del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad del estudiante.
     *
     * @param edad Nueva edad del estudiante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}