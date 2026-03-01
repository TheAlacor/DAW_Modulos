import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Book[] library = {
            new Book("A", "Bob", "AA", 10),
            new Book("B", "Bob", "AA", 34),
            new Book("C", "Bob", "AA", 12),
            new Book("D", "Bob", "AA", 20),
            new Book("E", "Bob", "AA", 31),
        };

        Arrays.sort(library);
        // Book.obtainMostExpensive(library);

        Book.toString(library);
    }
 
}