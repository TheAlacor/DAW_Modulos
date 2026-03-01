package com.vehicles;

import java.util.regex.*;

public class Motocicleta
{
    //Constant

    private static final Pattern REGISTRO_PATTERN = Pattern.compile("^\\d{4}[[A-Z^AEIOUQÑ]]{3}$");


    // Attributes

    private double caballos;
    private double velocidadPunta;
    private String registro;

    //Constructors

    public Motocicleta(){
      this.caballos = 0;
      this.velocidadPunta = 0;
      this.registro = "0000AAA";
	  }

    public Motocicleta(double caballos, double velocidadPunta, String registro){
        this.registro = registro;
        this.caballos = caballos;
        this.velocidadPunta = velocidadPunta;
    }

    //Methods

    public void MostrarMatricula(){
    
		  System.out.println(this.getRegistro());
	  }

    private static boolean esValidoRegistro(String registro){
      registro = registro.toUpperCase();
		  return Motocicleta.REGISTRO_PATTERN.matcher(registro).matches();
	  }

    // Getters y setters

    public double getCaballos(){
		  return this.caballos;
	  }

    public void setCaballos(double caballos){
		  this.caballos = caballos;
	  }

    public double getVelocidadPunta(){
		  return this.velocidadPunta;
	  }
    
    public void setVelocidadPunta(double velocidadPunta){
		  this.velocidadPunta = velocidadPunta;
	  }

    public String getRegistro(){
		  return this.registro;
	  }

    public void setRegistro(String registro) throws Exception{
      if(!Motocicleta.esValidoRegistro(registro)){
        throw new Exception("El  siguiente registro no sigue el patron pedido" + registro);
      }

      this.registro = registro;
	  }
}