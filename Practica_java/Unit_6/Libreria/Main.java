import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        // variables y objetos

        Libro[] arrayLibro = new Libro[] {
            new Libro("Don Quijote de la Mancha","Miguel de Cervantes","9788420412146","Alfaguara",25),
            new Libro("1984","George Orwell","9788499890944","Debolsillo",18),
            new Libro("Don Quijote de la Mancha","Miguel de Cervantes","9788420412146","Alfaguara",25)
        };

        //creamos objetos
        Libro libro1 = new Libro("El Principito", 
                                 "Antoine de Saint-Exupéry", 
                                 "9788478887193", 
                                 "Editorial Gustavo", 
                                 23);

        Libro libro2 = new Libro("1984", 
                                 "George Orwell", 
                                 "9788499890944", 
                                 "Debolsillo", 
                                 18);
        
        Libro libro3 = new Libro("Don Quijote de la Mancha",
                                 "Miguel de Cervantes",
                                 "9788420412146",
                                 "Alfaguara",
                                 25);

        System.out.println(libro1.toString());

        System.out.println();

        Libro.mostrarLibros(arrayLibro);

        System.out.println();

        // System.out.println("Metodo buble");

        // Libro.bubleSort(arrayLibro);

        // Libro.mostrarLibros(arrayLibro);

        // System.out.println();

        System.out.println("Metodo Sort");

        Arrays.sort(arrayLibro);

        Libro.mostrarLibros(arrayLibro);
    }
}