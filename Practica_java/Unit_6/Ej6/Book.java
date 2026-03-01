
public class Book implements Comparable<Book>
{
    //Attribute

    private String title = "";
    private String author = "";
    private String isbn = "";
    private String editorial = "";
    private int price = 0;

    //Constructor
    public Book() {}

    public Book(String title, String author, String isbn, String editorial, int price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.editorial = editorial;
        this.price = price;
    }

    public Book(Book book) {
        if (book != null) {
            this.title = book.title;
            this.author = book.author;
            this.isbn = book.isbn;
            this.editorial = book.editorial;
            this.price = book.price;
        }
    }

    //Method

    //getters and setters

    //title
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    //author
    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    //isbn
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }

    //editorial
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String getEditorial(){
        return this.editorial;
    }

    //price 
    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    //method buble(first option)

    public static void buble(Book[] books){
        Book aux;

        for(int i = 1;i<books.length;i++){
            for(int j=0;j<books.length;j++){
                if(books[j].price > books[i].price){
                    aux = books[j];
                    books[j] = books[i];
                    books[i] = aux;
                }
            }
        }

    }

    //2º option compareTo
    // @Override
    // public int compareTo(Book book){
    //     return this.price - book.price;
    // }

    // ej6 alfabeticamente
    @Override
    public int compareTo(Book book){
        return this.title.compareTo(book.title);
    }

    // public static void toString(Book[] books){
    //     for(int i=0;i<books.length;i++){
    //         System.out.printf("Title: %s\nAuthor:%s\nIsbn:%s\nEditorial: %s\nPrice: %.2f ",title,author,isbn,editorial,price );
    //     }
    // }

    //mostrar cantidad de libros en la lista
    public static void showQuantity(Book[] books){
        System.out.println(books.length);
    }

    // //insertar un libro en la siguiente posicion libre
    // public boolean insertarLibro(Book book){
    //     boolean insertado=false;
    //     if(numLibros < TAM_LISTA){
    //         lista[numLibros] = libro;
    //         numlibro++;
    //         insertado=true;
    //         Arrays.sort(lista, 0,numLibros)
    //     }
    //     return insertado;
    // }

    //añadir libro en posicion j
    public static void addBook(Book[] books, Book nuevo, int posicion){
        for(int i = books.length - 1; i > posicion; i--){
            books[i] = books[i - 1];
        }

        books[posicion] = nuevo;
    }

    public static void deleteBook(Book[] books, int posicion) {
        for (int i = posicion; i < books.length - 1; i++) {
            books[i] = books[i + 1];
        }
    
        books[books.length - 1] = null;
    }

    public static void showBook(Book[] books, int posicion) {
        System.out.print(books[posicion].toString());
    }


    public static void toString(Book[] books)
    {
       for(int i = 0; i < books.length;i++)
       {
            System.out.printf("%d-%s\n",i,books[i].toString());
       }
    }
}