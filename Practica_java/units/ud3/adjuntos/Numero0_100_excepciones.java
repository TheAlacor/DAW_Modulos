/*Realiza un programa en Java en el que se solicite al usuario la introducción
de un número por teclado comprendido entre el 0 y el 100. Utilizando manejo de
excepciones, debes controlar la entrada de dicho número y volver a solicitarlo
en caso de que ésta sea incorrecta.*/

import java.util.Scanner;

/**
*
* @author MDG
*/

public class Numero0_100_excepciones{
	public static void main(String [] args){
		//Variables y objetos
		int num=-1;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		do{
			try{
				System.out.println("Introduce un número [0-100]: ");
				num = Integer.parseInt(sc.nextLine());
			}
			/*El método parseInt puede lanzar la excepcion NumberFormatException
			si el String que se le pasa no contiene un valor entero*/
			catch (NumberFormatException e){
				System.out.println("Error, no es un número correcto: ");
				e.printStackTrace();
			}
			/*El método nextLine puede lanzar las excepciones NoSuchElementExcpetion
			y IllegalStateException */
			catch(Exception e){
				e.printStackTrace();
			}
		}while(num<0 || num>100);
		System.out.printf("Número correcto: %d",num);
	}
}