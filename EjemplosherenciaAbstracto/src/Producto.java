public abstract class Producto {
    /*una clase abstracta no puede instanciarse(no se usa constructor)*/
    /*podemos definir metodos abstractos y metodos normales*/

    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected double precio;


    public Producto(String codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCodigo() {
        return this.codigo;

    }

    public String getDescripcion() {

        return this.descripcion;
    }

    public double getPrecio() {

        return this.precio;
    }

    public void setPrecio(double precio) {

        this.precio = precio;
    }

    public abstract double obtenerDescuento();

    public abstract String calificacion();

    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("CODIGO: ").append(this.codigo).append("\n");
        sb.append("NOMBRE: ").append(this.nombre).append("\n");
        sb.append("DESCRIPCION: ").append(this.descripcion).append("\n");
        sb.append("PRECIO: ").append(this.precio).append("\n");
        return sb.toString();
    }

}
