public class Libro implements Comparable<Libro>
{
    //atributos
    private String titulo ="";
    private String autor ="";
    private String isbn ="";
    private String editorial ="";
    private float precio =0;

    //COnstructores
    public Libro() {}

    public Libro(String titulo, String autor, String isbn, String editorial, float precio){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.precio = precio;
    }

    // constructor copia
    public Libro(Libro copLibro){
        this.titulo = copLibro.titulo;
        this.autor = copLibro.autor;
        this.isbn = copLibro.isbn;
        this.editorial = copLibro.editorial;
        this.precio = copLibro.precio;
    }

    //Metodos
    public String toString(){
        return String.format("Titulo: %s\nAutor: %s\nIsbn: %s\nEditorial: %s\nPrecio: %.2f", this.titulo, this.autor, this.isbn, this.editorial, this.precio);
    }

    public static void mostrarLibros(Libro[] arrayLibro)
    {
       for(int i = 0; i < arrayLibro.length;i++)
       {
            System.out.printf("%d-%s\n\n",i + 1,arrayLibro[i].toString());
       }
    }


    public static void bubleSort(Libro[] arrayLibro) {

    Libro aux;

        for(int i = 0; i < arrayLibro.length; i++){
            for(int j = 0; j < arrayLibro.length - 1 - i; j++){
                if(arrayLibro[j].getPrecio() > arrayLibro[j+1].getPrecio()){
                    aux = arrayLibro[j];
                    arrayLibro[j] = arrayLibro[j+1];
                    arrayLibro[j+1] = aux;
                }
            }
        }
    }

    @Override
    public int compareTo(Libro arrayLibro){
        return Float.compare(this.precio, arrayLibro.precio);
    }

    //Getters and setters

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String getEditorial(){
        return this.editorial;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public float getPrecio(){
        return this.precio;
    }


}