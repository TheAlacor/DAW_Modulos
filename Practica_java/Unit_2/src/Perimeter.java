import java.util.Scanner;
public class Perimeter
{
    public static void main(String[]args)
    {
        //variables and object
        Scanner sc = new Scanner(System.in);
        int base,height,perimeter; 

        //Problem resolution
        System.out.print("Introduce the base from a rectangle: ");  
        base = sc.nextInt();
        System.out.println("Introduce the height from a rectangle: ");
        height = sc.nextInt();   

        perimeter = (2*base) + (2*height); 
        System.out.printf("The base from the rectangle is %dcm and the height from the rectangle is %dcm",base,height); 
        System.out.printf("\nThe perimeter from the rectangle is: %dcm",perimeter);
    }
}