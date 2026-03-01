import java.util.Scanner;

public class SwapVariables
{
    public static void main(String[]args)
    {
        // Defining variables and objects
        Scanner sc = new Scanner(System.in);

        double a = 0,b = 0,c = 0;

        // Setting a and b value

        System.out.print("Give a value for a: ");
        a = sc.nextDouble();

        System.out.print("\nGive me a value for b: ");
		b = sc.nextDouble();

        // Swap variables
        c = a;
        a = b;
        b = c;

        System.out.printf("\na = %.2f\nb = %.2f", a, b);

    }
}