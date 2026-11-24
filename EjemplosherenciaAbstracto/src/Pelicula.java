import java.time.LocalDate;

public class Pelicula extends Producto{

    private String genero;
    private int duracion;
    private String ISAN;
    private String director;
    private String calificacion;
    private String fromato;

    public String getGenero() {
        return this.genero;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String getISAN() {
        return this.ISAN;
    }

    public String getDirector() {
        return this.director;
    }

    public String getCalificacion() {
        return this.calificacion;
    }

    public String getFromato() {
        return this.fromato;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public double obtenerDescuento() {
        return 10;
    }

    @Override
    public String calificacion() {
        return "";
    }

    public Pelicula(String genero, int duracion, String ISAN, String director, String calificacion, String fromato, String codigo, String nombre, String descripcion, double precio) {
        super(codigo, nombre, descripcion, precio);
        this.genero = genero;
        this.duracion = duracion;
        this.ISAN = ISAN;
        this.director = director;
        this.calificacion = calificacion;
        this.fromato = fromato;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("genero='").append(genero).append("\n");
        sb.append("Duracion=").append(duracion).append("\n");
        sb.append("ISAN='").append(ISAN).append("\n");
        sb.append("Director='").append(director).append("\n");
        sb.append("Calificacion='").append(calificacion).append("\n");
        sb.append("Formato='").append(fromato).append("\n");
        return sb.toString();
    }
}
