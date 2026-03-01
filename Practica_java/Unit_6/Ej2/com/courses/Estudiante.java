package com.courses;

import java.util.regex.*;

public class Estudiante
{
    //Constant

    private static final Pattern ID_PATTERN = Pattern.compile("^\\d{8}[A-Z]$");

    // Attribute,sino detallan siempre private

    private String id = "00000000A";
    private String nombre ="";

    private float[] notaTrimestre = {-1, -1, -1};

    //Constructor

    public Estudiante() {}

    public Estudiante(String id, String nombre) throws Exception
    {
        this.id = id;
        this.nombre = nombre;
    }

    public Estudiante(Estudiante estudiante) throws Exception
	{
		this.setId(estudiante.getId());
		this.setNombre(estudiante.getNombre());

		this.setNota(0, estudiante.getNota(0));
		this.setNota(1, estudiante.getNota(1));
		this.setNota(2, estudiante.getNota(2));
	}

    //Methods
     public float calcularNotaTotal()
	{
		float resultado = 0;
		byte contadorNota = 0;

		for (float nota : this.notaTrimestre)
		{
			if (nota >= 0)
			{
				resultado += nota;
				contadorNota++;
			}
		}

		return contadorNota == 0 ? -1 : resultado / contadorNota;
	}

    public void mostrarInformacion()
	{
		System.out.printf("Nombre: %s\nID: %s\n", this.getNombre(), this.getId());
		System.out.printf("\nTrimestre 1 (nota): %.1f\nTrimestre 2 (nota): %.1f\nTrimestre 3 nots: %.1f", this.getNota(0), this.getNota(1), this.getNota(2));
		System.out.printf("\nTotal: %.1f\n", this.calcularNotaTotal());
	}

    public String getId()
	{
		return this.id;
	}

	public void setId(String id) throws Exception
	{
		if (!Estudiante.ID_PATTERN.matcher(id).matches())
		{
			throw new Exception("ID invalido! " + id);
		}

		this.id = id;
	}

    //Getters and Setters

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setNota(int indiceTrimestre, float nota)
	{
		this.notaTrimestre[indiceTrimestre] = nota;
	}

	public float getNota(int indiceTrimestre)
	{
		return this.notaTrimestre[indiceTrimestre];
	}

	public float[] getNotas()
	{
		return this.notaTrimestre;
	}
}