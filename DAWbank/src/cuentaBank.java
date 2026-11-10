public class cuentaBank {

    private final String iban;
    private final String titular;
    private int saldo = 0;



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

    public int getSaldo(){
        return this.saldo;
    }

    public String infoCuentaBank(){
        String infoCuentaBank="";
        infoCuentaBank+="IBAN :"+this.iban+"\n";
        infoCuentaBank+="TITULAR :"+this.titular+"\n";
        infoCuentaBank+="SALDO :"+this.saldo+"\n";
        return infoCuentaBank;
    }



    private final double euroIngresado = 0;
    public boolean ingreso(){
        if(euroIngresado>0){
            if (euroIngresado)
        }
    }

}