import java.time.LocalDate;

public class Libro extends Producto{

    private String ISBN;
    private String Autor;
    private String Editorial;
    private LocalDate fechaPublicacion;
    private int nPaginas;

    public Libro(String codigo, String nombre, String descripcion, double precio, String ISBN, String Autor, String Editorial, LocalDate fechaPublicacion, int nPaginas) {
        super(codigo, nombre, descripcion, precio);
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.nPaginas = nPaginas;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public String getAutor() {
        return this.Autor;
    }

    public String getEditorial() {
        return this.Editorial;
    }

    public LocalDate getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    public int getnPaginas() {
        return this.nPaginas;
    }


    @Override
    public double obtenerDescuento() {
        return 20;
    }

    @Override
    public String calificacion() {
        return "";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("ISBN='").append(ISBN).append("\n");
        sb.append("Autor='").append(Autor).append("\n");
        sb.append("Editorial='").append(Editorial).append("\n");
        sb.append("fechaPublicacion=").append(fechaPublicacion).append("\n");
        sb.append("nPaginas=").append(nPaginas).append("\n");
        return sb.toString();
    }
}
