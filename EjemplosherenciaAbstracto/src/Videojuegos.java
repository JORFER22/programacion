public class Videojuegos extends Producto {

    private String PEG;
    private String plataforma;
    private String desarrolladora;


    public Videojuegos(String codigo, String nombre, String descripcion, double precio, String PEG, String plataforma, String desarrolladora) {
        super(codigo, nombre, descripcion, precio);
        this.PEG = PEG;
        this.plataforma = plataforma;
        this.desarrolladora = desarrolladora;
    }

    public String getPEG() {
        return this.PEG;
    }

    public String getPlataforma() {
        return this.plataforma;
    }

    public String getDesarrolladora() {
        return this.desarrolladora;
    }


    @Override
    public double obtenerDescuento() {
        return 0;
    }

    @Override
    public String calificacion() {

        return this.PEG;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("PEG= ").append(PEG).append("\n");
        sb.append("plataforma= ").append(plataforma).append("\n");
        sb.append("desarrolladora= ").append(desarrolladora).append("\n");

        return sb.toString();
    }
}
