import java.util.Scanner;

public class Hipotenusa
{
    public static void main(String[]args)
    {
            //variables and objects
            Scanner sc = new Scanner(System.in);
            double a,b,hipotenusa;

            //problem resolution
            System.out.println("Write one cathetus from a triangle: ");
            a = sc.nextDouble();
            System.out.println("Write the other cathetus from the triangle: ");
            b = sc.nextDouble();

            hipotenusa = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
            System.out.println("Result from Hipotenusa: " + hipotenusa);
            
    }
}