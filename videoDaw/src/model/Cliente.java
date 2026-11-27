package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.PrimitiveIterator;

public class Cliente {


    private final String DNI;
    private final String nombre;
    private String numSocio;
    private String direccion;
    private final LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private Pelicula[] peliculasAlquiladas;

    private final DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Cliente(String DNI, String nombre, String numSocio, LocalDate fechaNacimiento, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;

        this.fechaBaja=null;
        this.peliculasAlquiladas= new Pelicula[5];
    }

    public String getDNI() {
        return this.DNI;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumSocio() {
        return this.numSocio;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public LocalDate getFechaBaja() {
        return this.fechaBaja;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DNI= ").append(DNI).append("\n");
        sb.append("Nombre= ").append(nombre).append("\n");
        sb.append("Numero de Socio= ").append(numSocio).append("\n");
        sb.append("Direccion= ").append(direccion).append("\n");
        sb.append("Fecha de nacimiento= ").append(fechaNacimiento.format(formatter)).append("\n");
        sb.append("Fecha de Baja= ").append(fechaBaja).append("\n");
        return sb.toString();
    }

}
