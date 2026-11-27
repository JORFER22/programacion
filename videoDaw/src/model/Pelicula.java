package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {
    private String codigo;
    private final String titulo;
    private final TIPO genero;
    private LocalDate registro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    private final DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pelicula(String codigo, String titulo, TIPO genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.registro = LocalDate.now();
        this.fechaAlquiler=null;
        this.fechaBaja=null;
        this.isAlquilada=false;
    }


    public String getCodigo() {
        return this.codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public TIPO getGenero() {
        return this.genero;
    }

    public LocalDate getRegistro() {
        return this.registro;
    }

    public LocalDate getFechaBaja() {
        return this.fechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public boolean isAlquilada() {
        return this.isAlquilada;
    }

    public void setAlquilada(boolean alquilada) {
        isAlquilada = alquilada;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setRegistro(LocalDate registro) {
        this.registro = registro;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pelicula{");
        sb.append("Codigo= ").append(codigo).append("\n");
        sb.append("Titulo= ").append(titulo).append("\n");
        sb.append("Genero= ").append(genero).append("\n");
        sb.append("Registro= ").append(registro).append("\n");
        sb.append("Fecha de baja= ").append(fechaBaja).append("\n");
        sb.append("Fecha de alquiler= ").append(fechaAlquiler).append("\n");
        sb.append("ESTA ALQUILADA").append(this.isAlquilada).append("\n");
        return sb.toString();
    }
}
