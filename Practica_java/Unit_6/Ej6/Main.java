import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        
        Book[] books = new Book[] {
            new Book("1984", "George Orwell", "9780451524935", "Secker & Warburg", 20),
            new Book("Cien años de soledad", "Gabriel García Márquez", "9780307474728", "Sudamericana", 25),
            new Book("Don Quijote de la Mancha", "Miguel de Cervantes", "9788491050291", "Francisco de Robles", 30),
            new Book("El Hobbit", "J.R.R. Tolkien", "9780547928227", "George Allen & Unwin", 22),
            new Book("Orgullo y prejuicio", "Jane Austen", "9780141439518", "T. Egerton", 18)
        };

        Arrays.sort(books);
        // Book.obtainMostExpensive(library);

        Book.toString(books);
    }
 

}