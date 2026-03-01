import java.util.Scanner;
public class PrimerPrograma
{
    public static void main(String[]args)
    {
        Scanner sc  = new Scanner(System.in);
        String name = "";
        String date = "";

        System.out.println("***************************");
        System.out.println("Módulo Profesional-Programacion");
        System.out.println("UNIDAD-1 Introducción a la Programación");
        System.out.print("Nombre y Apellidos: ");
        name = sc.nextLine();
        System.out.print("Fecha de realización del ejercicio: ");
        date = sc.nextLine();
        System.out.println("Este es mi primer programa escrito en java");

        
    }
}