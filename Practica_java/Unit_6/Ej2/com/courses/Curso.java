package com.courses;

public class Curso
{
	// Attributes
    private final int N_ALUMN = 5;
	private String nombre = "";
	private String nombreProfesor = "";
	private Estudiante[] estudiante;



	// Constructors
    public Curso() {}

    public Curso(String nombre, String nombreProfesor, Estudiante[] estudiante)
	{
		this.setNombre(nombre);
		this.setNombreProfesor(nombreProfesor);
		estudiante = new Estudiante[N_ALUMN];
    }

 public float calculoMediaTrimestre(int indiceTrimestre)
    {
        float resultado = 0;
        byte contadorNota = 0;

        for (Estudiante estudiante : this.estudiante)
        {
            if (estudiante == null)
            {
                continue;
            }

            float nota = estudiante.getNota(indiceTrimestre);

            if (nota >= 0)
            {
                resultado += nota;
                contadorNota++;
            }
        }

        return resultado / contadorNota;
    }

    public void mostrarInformacion()
    {
        System.out.printf("Curso:\n");
        System.out.printf("Name: %s\nProfessor\'s name: %s", this.getNombre(), this.getNombreProfesor());

        for (Estudiante estudiante : this.estudiante)
        {
            if (estudiante != null)
            {
                System.out.print("\nESTUDIANTE:\n");
                estudiante.mostrarInformacion();
            }
        }
    }

 // Getters and setters
    public String getNombre()
    {
        return this.nombre;
    }  

        public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombreProfesor()
    {
        return this.nombreProfesor;
    }

    public void setNombreProfesor(String name)
    {
        this.nombreProfesor = name;
    }

    public Estudiante[] getEstudiante()
    {
        return this.estudiante;
    }

    public void setEstudiante(Estudiante[] students)
    {
        for (int i = 0; i < Math.min(estudiante.length, this.estudiante.length); i++)
        {
            this.estudiante[i] = this.estudiante[i];
        }
    }              
}