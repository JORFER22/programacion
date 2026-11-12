import java.util.Scanner;
import model.Movimiento;
import model.Tipo;

void main(String[] args){
    final String patternIban= "^[A-Z]{2}\\d{22}$";
    Scanner sc= new Scanner(System.in);
    IO.println("BIENVENIDO A DAWBANK \nCREE SU CUENTA INGRESANDO EL IBAN Y EL NOMBRE DEL TITULAR ;");
    IO.println("INGRESE EL IBAN QUE DEBE TENER DOS LETRAS SEGUIDO DE 22 DIGITOS");
    String iban = sc.nextLine();
    IO.println("INGRESE EL NOMBRE COMPLETO DEL TITULAR");
    String titular = sc.nextLine();
    if (iban.matches(patternIban)){
        cuentaBank c1 = new cuentaBank(iban, titular);
        int opcion ;
        do {
            IO.println("INTRODUZCA UNA DE LAS OPCIONES A REALIZAR EN DAWBANK");
            IO.println("1 DATOS DE LA CEUNTA \n2 IBAN \n3 TITULAR \n4 SALDO\n5 INGRESO \n6 RETIRADA \n7 MOVIMIENTO \n8 SALIR ");
            opcion = sc.nextInt();
            if (op

        }while (opcion==8);

//        IO.println(c1.infoCuentaBank().toUpperCase());

    }else {
        IO.println("INTRODUZCA UN IBAN CORRECTO");
    }


//    cuentaBank c1= new cuentaBank("ES12345678911235", "Fabiana sevilla");
//    Movimiento m1= new Movimiento(Tipo.RETIRADA, 135 );
//    IO.println(c1.infoCuentaBank()+"\n"+m1.infoMovimiento());
}