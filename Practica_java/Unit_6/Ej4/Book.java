
public class Book
{
    private String title = "";
    private String author = "";
    private String editorial = "";

    private float price = 0;


    // Constructor

    public Book() {}

    public Book(String title, String author, String editorial, float price)
    {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.price = price;
    } 

    public Book(Book book)
    {
        this.setTitle(book.getTitle());
        this.setAuthor(book.getAuthor());
        this.setEditorial(book.getEditorial());
        this.setPrice(book.getPrice());       
    }

    // Getters and Setters 

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }

    public String getEditorial()
    {
        return this.editorial;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public float getPrice()
    {
        return this.price;
    }

    // metodo burbuja

    public static void obtainMostExpensive(Book[] books)
    {
        //Book mostExpensiveBook = null;
        //float price = Float.MIN_VALUE;
        Book aux;

        for(int i = 0;i<books.length;i++){
            for(int j = 0;j<books.length;j++){
                if(books[j].price > books[j+1].price){
                    aux=books[j];
                    books[j] = books[j+1];
                    books[j+1]=aux;
                }
            }
        }
    }

    public static void toString(Book[] books)
    {
       for(int i = 0; i < books.length;i++)
       {
            System.out.printf("%d-%s\n",i,books[i].toString());
       }
    }

    public int compareTo(Book book){
        @Override
        int orden = 0;
        if(price < book.price)
            orden = -1;
        else
            if(price > book.price)
                orden = 1;
        return orden;

    }

}