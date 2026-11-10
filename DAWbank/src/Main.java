import java.util.Scanner;
import model.Movimiento;
import model.Tipo;

void main(String[] args){
    Scanner sc= new Scanner(System.in);
    cuentaBank c1= new cuentaBank("ES12345678911235", "Fabiana sevilla");
    Movimiento m1= new Movimiento(15243, Tipo.RETIRADA, 135 );

    IO.println(c1.infoCuentaBank()+"\n"+m1.infoMovimiento());
}