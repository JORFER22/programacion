package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {
    private final String codigo;
    private final String titulo;
    private String genero;
    private final LocalDate registro;
    private final LocalDateTime fechaBaja;
    private LocalDateTime fechaAlquiler;


    private final DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");


}
