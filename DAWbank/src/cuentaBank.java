import model.Movimiento;
import model.Tipo;

public class cuentaBank {

    private final String iban;
    private final String titular;
    private double saldo = 0;
    private final Movimiento [] movimientos = new Movimiento[100];
    private int cantidadMovimiento = 0;




    public cuentaBank(String iban, String titular){
        this.iban=iban;
        this.titular=titular;
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
            this.saldo+=euroIngresado;
            Movimiento ingreso = new Movimiento(Tipo.INGRESO, euroIngresado);
            this.movimientos[this.cantidadMovimiento] = ingreso;
            this.cantidadMovimiento++;
            resultado = true;

        }
        return resultado;
    }


    public boolean retiro(double euroRetiro){
        boolean resultado=  false;

        if(euroRetiro>0){
            this.saldo-=euroRetiro;
            Movimiento retiro = new Movimiento(Tipo.RETIRADA, euroRetiro);
            this.movimientos[this.cantidadMovimiento] = retiro;
            this.cantidadMovimiento++;
            resultado = true;

        }
        return resultado;
    }



}