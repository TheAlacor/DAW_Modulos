import java.util.Scanner;

public class MediaTresNum
{
    public static void main(String[]args)
    {
        // variables y objetos
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,media;

        // resolucion del problema
        System.out.print("Introduce un numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = sc.nextInt();
        System.out.println("Introduce un ultimo numero: ");
        num3 = sc.nextInt();

        media = (num1 + num2 + num3);
        System.out.println("El resultadop es :" + media);
        
    }
}