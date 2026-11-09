package model;

public class Movimiento {
    private static int numMovimiento= 0;

    private final int id;
    private final String fecha;
    private final String tipo;
    private final int cantidad;

    public Movimiento(int id, String fecha, String tipo, int cantidad){
        this.fecha=fecha;
        this.tipo= tipo;
        this.cantidad= cantidad;

        this.id=numMovimiento;
        numMovimiento++;

    }
    public int getId(){
        return this.id;
    }
    public String getFecha(){
        return this.fecha;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getCantidad(){
        return this.cantidad;
    }

    public String infoMovimiento(){
        String infoMovimiento="";
        infoMovimiento+="ID :"+this.id+"\n";
        infoMovimiento+="FECHA :"+this.fecha+"\n";
        infoMovimiento+="TIPO :"+this.tipo+"\n";
        infoMovimiento+="CANTIDAD :"+this.cantidad+"\n";
        return infoMovimiento;
    }


}
