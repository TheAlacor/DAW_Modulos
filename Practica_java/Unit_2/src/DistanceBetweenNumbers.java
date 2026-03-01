import java.util.Scanner;

public class DistanceBetweenNumbers
{
    public static void main(String[]args)
    {
        //Defining variables 
        Scanner input = new Scanner(System.in);

        double x = 0, y = 0;
        double distance = 0;

        //setting points

        System.out.print("Set the first point: ");
        x = input.nextDouble();  

        System.out.println("Set the second point: ");
        y = input.nextDouble();

        //Computing distance

        distance = Math.abs(x - y);
        System.out.printf("\nThe distance between these points is %.2f.", distance);

    }
}