package model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libro {

    private static int nLibros = 0;
    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final int ID;
    private String isbn;
    private String titulo;
    private String autor;
    private int nPaginas;
    private String editorial;
    private Genero genero;
    private LocalDate fechaPublicacion;

    public  Libro(String isbn, String titulo, String autor ){
        this.isbn= isbn;
        this.titulo= titulo;
        this.autor= autor;
        this.nPaginas= 0;
        this.editorial="";
        this.genero = Genero.GENERICO;
        //this.fechaPublicacion= LocalDate.of(2026, 10, 11);
        this.fechaPublicacion = LocalDate.now(); //sirve para dar la fecha de creacion
        //LocalDate.parse("10/11/2026", formatter);

        this.ID= nLibros;
        nLibros++;
    }
    public  Libro(String isbn, String titulo, String autor, int nPaginas, String editorial, Genero genero, LocalDate fechaPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;

        this.ID= nLibros;
        nLibros++;
    }
    //definimos las propiedades : getters y setters
    public String getIsbn(){

        return  this.isbn;
    }
    public int getID(){

        return  this.ID;
    }
    public String getTitulo(){

        return  this.titulo;
    }
    public String getAutor(){

        return this.autor;
    }
    public void setAutor(String autor){

        this.autor = autor;
    }
    public String getEditorial(){

        return this.editorial;
    }
    public void setEditorial(String editorial){

        this.editorial= editorial;
    }
    public LocalDate getFechaPublicacion(){

        return this.fechaPublicacion;
    }
    public Genero getGenero(){

        return this.genero;
    }
    public void setGenero(Genero genero){

        this.genero = genero;
    }
    public int getnPaginas(){

        return this.nPaginas;
    }
    public void setnPaginas(int nPaginas){

        this.nPaginas= nPaginas;
    }
    //METODO PARA OBTENER TODA LA INFORMACION DE NUESTRO LIBRO

    public String infoLibro(){
        String infoLibro="";
        infoLibro += "ID: " + this.ID + "\n";
        infoLibro += "Titulo: " + this.titulo;
        infoLibro += "Autor: " +this.autor + "\n";
        infoLibro += "Isbn. " + this.isbn + "\n";
        infoLibro += "Editorial: " +this.editorial + "\n";
        infoLibro += "Numero de paginas: " +this.nPaginas + "\n";
        infoLibro += "Genero: " + this.genero + "\n";
        infoLibro += "Fecha de publicacion. " +this.fechaPublicacion.format(formatter)+"\n";
        return infoLibro;
    }

}//final



