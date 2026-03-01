import java.util.InputMismatchException;
import java.util.Scanner;

public class Grados
{
    public static void main(String[]args)
    {
        try {
            // Variables y objetos
        Scanner sc = new Scanner(System.in);
        int gradosFahr = 0, gradosCel;

        //Resolucion del problema
        System.out.print("Introduce grados Fahrenheit para convertirlos a celsius: ");
        gradosFahr = sc.nextInt();

        gradosCel = (gradosFahr - 32)*(5/9);
        System.out.println(gradosCel);

        }catch (InputMismatchException e) {
            System.out.println("Error,solo puedes introducir datos numericos");
          }
        catch (Exception e) {
            System.out.println(e);
        }
    
    }
}