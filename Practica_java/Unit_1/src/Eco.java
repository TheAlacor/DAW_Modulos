
import java.util.Scanner;

public class Eco
{
    public static void main(String[]args)
    {
        //Variables and objects
        Scanner sc = new Scanner(System.in);
        String word;
        int value;
        //Problem resolution
        System.out.println("Introduce a value or a word: ");
        
        word = sc.nextLine();
        value = sc.nextInt();
        
        System.out.printf("Se ha introducido lo siguiente: %d %s",value, word);

    }
}