import model.Cliente;
import model.Pelicula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class videoDaw {
    private String CIF;
    private String direccion;
    private LocalDate fechaAlta;

    private Pelicula[] peliculas ;
    private Cliente[] clientes;
    private int numPeliculas;
    private int numClientes;

    private final DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public videoDaw(String CIF, String direccion){
        this.CIF= CIF;
        this.direccion=direccion;
        this.fechaAlta=LocalDate.now();

        this.peliculas= new Pelicula[100];
        this.clientes= new Cliente[100];
        this.numPeliculas=0;
        this.numClientes= 0;

    }

    public String getCIF() {
        return this.CIF;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("CIF: ").append(this.CIF).append("\n");
        sb.append("Direccion: ").append(this.direccion).append("\n");
        sb.append("Fecha de alta: ").append(this.fechaAlta.format(formatter)).append("\n");
        return super.toString();
    }
    /*metodo paraalquilar una pelicula*/
    public boolean

/* metodo para ampliar la dimension*/
    public boolean registroCl(Cliente registroCliente){
        boolean resultado= false;
        if(this.numClientes<this.clientes.length){
            this.clientes[numClientes]=registroCliente;
            numClientes++;
        }else if (this.numClientes>=this.clientes.length){
            this.ampliarDimensionCliente();
            this.clientes[numClientes]=registroCliente;
            numClientes++;
        }
        return resultado;
    }


    public boolean registroPe(Pelicula registroPelicula ){
        boolean resultado = false;
        if (this.numPeliculas<this.peliculas.length){
            this.peliculas[numPeliculas]=registroPelicula;
            numPeliculas++;
        }else if (this.numPeliculas>=this.peliculas.length){
         ampliarDimensionPelicula();
         this.peliculas[numPeliculas]=registroPelicula;
         numPeliculas++;
        }
        return resultado;
    }



    private void ampliarDimensionCliente(){
        Cliente [] clAux= new Cliente[this.clientes.length+100];
        for (int i =0 ; i < clientes.length; i++){
            clAux[i]=this.clientes[i];
        }
        this.clientes=clAux;
    }

    private void ampliarDimensionPelicula(){
        Pelicula[] peAux= new Pelicula[this.peliculas.length+100];
        for (int i = 0 ; i < peliculas.length; i++){
            peAux[i]=this.peliculas[i];
        }
        this.peliculas=peAux;
    }

}
