import model.Movimiento;
import model.Tipo;

public class cuentaBank {

    private final String iban;
    private final String titular;
    private double saldo;
    private final Movimiento [] movimientos;
    private int cantidadMovimiento;


    public cuentaBank(String iban, String titular){
        this.iban=iban;
        this.titular=titular;
        this.saldo=0.0;
        this.movimientos = new Movimiento[100];
        this.cantidadMovimiento = 0;
    }

    public String getIban(){

        return this.iban;
    }

    public String getTitular(){

        return this.titular;
    }

    public double getSaldo(){

        return this.saldo;
    }

    public String infoCuentaBank(){
        String infoCuentaBank="";
        infoCuentaBank+="IBAN :"+this.iban+"\n";
        infoCuentaBank+="TITULAR :"+this.titular+"\n";
        infoCuentaBank+="SALDO :"+this.saldo+"\n";
        return infoCuentaBank;
    }





    public boolean ingreso(double euroIngresado){
        boolean resultado=  false;

        if(euroIngresado>0){
            if (this.cantidadMovimiento<this.movimientos.length) {
                this.saldo += euroIngresado;
                Movimiento ingreso = new Movimiento(Tipo.INGRESO, euroIngresado);
                this.movimientos[this.cantidadMovimiento] = ingreso;
                this.cantidadMovimiento++;
                resultado = true;
            } else if (this.cantidadMovimiento>=this.movimientos.length) {
                this.ampliarDimension();
                this.saldo += euroIngresado;
                Movimiento ingreso = new Movimiento(Tipo.INGRESO, euroIngresado);
                this.movimientos[this.cantidadMovimiento] = ingreso;
                this.cantidadMovimiento++;
            }
        }
        return resultado;
    }


    public boolean retiro(double euroRetiro){
        boolean resultado=  false;

        if(euroRetiro>0){
            if (this.cantidadMovimiento< this.movimientos.length) {
                this.saldo -= euroRetiro;
                Movimiento retiro = new Movimiento(Tipo.RETIRADA, euroRetiro);
                this.movimientos[this.cantidadMovimiento] = retiro;
                this.cantidadMovimiento++;
                resultado = true;
            }else if (this.cantidadMovimiento >= this.movimientos.length){
                this.saldo -= euroRetiro;
                Movimiento retiro = new Movimiento(Tipo.RETIRADA, euroRetiro);
                this.movimientos[this.cantidadMovimiento] = retiro;
                this.cantidadMovimiento++;
                resultado = true;
            }
        }
        return resultado;
    }


    public String totalMovimientos(){
        String historial = "";
        if (this.cantidadMovimiento==0){
            historial="NO HAY MOVIMIENTOS ASOCIADOS \n";
        }else {
            for (int i=0;i<this.cantidadMovimiento;i++){
                historial += this.movimientos[i].infoMovimiento()+"\n";
            }
        }
        return historial;
    }

    private void ampliarDimension(){
        Movimiento[]movAux= new Movimiento[this.movimientos.length + 100];
        for (int i =0 ; i <movimientos.length; i++){
        movAux[i]=this.movimientos[i];
        }

    }


}