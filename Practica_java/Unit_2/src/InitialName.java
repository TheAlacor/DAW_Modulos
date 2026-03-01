import java.util.Scanner;

public class InitialName
{
    private static final int CHARACTER_IN_INITIALS = 2;

    public static void main(String [] args)
    {
        // defining variables
        Scanner sc = new Scanner(System.in);

        String name = "";
        String lastName1 = "";
        String lastName2 = "";
        String initials = "";

        //setting name

        System.out.print("Enter your name: ");
		name = sc.nextLine();
		
		System.out.print("Enter your first last name: ");
		lastName1 = sc.nextLine();
		
		System.out.print("Enter your second last name: ");
		lastName2 = sc.nextLine();

        // Getting initials

        initials += name.substring(0, CHARACTER_IN_INITIALS);
		initials += lastName1.substring(0, CHARACTER_IN_INITIALS);
		initials += lastName2.substring(0, CHARACTER_IN_INITIALS);
		
		System.out.printf("\nYour initials are %s.", initials);
    }
}