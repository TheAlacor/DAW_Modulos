import java.util.Scanner;

public class HelloName
{
    public static void main(String[]args)
    {
        //variables and objects
        Scanner sc = new Scanner(System.in);
        String name;

        //Problem resolution
        System.out.print("¿Cúal es tu nombre? ");
        name = sc.nextLine();
        System.out.printf("\nHola %s",name);
        
    }    
}
