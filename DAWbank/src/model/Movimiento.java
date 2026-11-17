package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    private static int numMovimiento= 1;

    private final int id;
    private final LocalDateTime fecha;
    private final Tipo tipo;
    private final double cantidad;
    private DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Movimiento(Tipo tipo, double cantidad){
        this.fecha=LocalDateTime.now();
        this.tipo= tipo;
        this.cantidad= cantidad;
        this.id=numMovimiento;
        numMovimiento++;
    }



    public int getId(){

        return this.id;
    }
    public LocalDateTime getFecha(){

        return this.fecha;
    }
    public Tipo getTipo(){

        return this.tipo;
    }
    public double getCantidad(){

        return this.cantidad;
    }

    public String infoMovimiento(){
        String infoMovimiento="";
        infoMovimiento+="ID : "+this.id+"\n";
        infoMovimiento+="FECHA : "+this.fecha.format(formatter)+"\n";
        infoMovimiento+="TIPO : "+this.tipo+"\n";
        infoMovimiento+="CANTIDAD : "+this.cantidad+"\n"+"\n";
        return infoMovimiento;
    }
//    public String mostrarInfoMovimiento(){
//        StringBuilder sb = new StringBuilder();
//        sb.append("ID: ").append(this.id).append("\n");
//        sb.append("Fecha: ").append(this.fecha.format(formatter)).append("\n");
//        sb.append("Tipo: ").append(this.tipo).append("\n");
//        sb.append("Cantidad: ").append(this.cantidad).append("\n");
//    }
}
