import java.util.Scanner;
import model.Movimiento;
import model.Tipo;

void main(String[] args) {
    final String patternIban = "^[A-Za-z]{2}\\d{22}$";
    Scanner sc = new Scanner(System.in);
    String iban;
    cuentaBank c1 = null;
    String titular = "";
    IO.println("BIENVENIDO A DAWBANK \nCREE SU CUENTA INGRESANDO EL IBAN Y EL NOMBRE DEL TITULAR ;");
    while (titular==null || titular=="") {
        IO.println("INGRESE EL NOMBRE COMPLETO DEL TITULAR");
        titular = sc.nextLine();
    }
    do {
        IO.println("INGRESE EL IBAN QUE DEBE TENER DOS LETRAS SEGUIDO DE 22 DIGITOS");
        iban = sc.nextLine();
        if (iban.matches(patternIban)) {
             c1 = new cuentaBank(iban, titular);
        } else {
            IO.println("INTRODUZCA UN IBAN CORRECTO");
        }

    } while (!iban.matches(patternIban));

    int opcion;
    do {
        IO.println("INTRODUZCA UNA DE LAS OPCIONES A REALIZAR EN DAWBANK");
        IO.println("1 DATOS DE LA CEUNTA \n2 IBAN \n3 TITULAR \n4 SALDO\n5 INGRESO \n6 RETIRADA \n7 MOVIMIENTO \n8 SALIR ");
        opcion = sc.nextInt();
        if (opcion > 0 && opcion < 9) {
            if (opcion==1){
                IO.println(c1.infoCuentaBank().toUpperCase());
            } else if (opcion==2) {
                IO.println("SU IBAN ES : "+c1.getIban().toUpperCase()+"\n");

            } else if (opcion==3) {
                IO.println("EL NOMBRE DEL TITULAR ES : "+c1.getTitular().toUpperCase()+"\n");

            } else if (opcion==4) {
                IO.println("EL SALDO DE LA CUENTA ES : "+c1.getSaldo()+"\n");

            } else if (opcion==5) {
                IO.println("AUN NO CONFIGURADO");

            }else if (opcion==6) {
                IO.println("AUN NO CONFIGURADO");

            } else if (opcion==7) {
                IO.println("AUN NO CONFIGURADO");

            } else if (opcion==8) {
                IO.println("SALIENDO DEL SISTEMA \nMUCAHS GRACIAS POR PREFERIR DAWBANK");

            }

        } else {
            IO.println("NO ES UNA OPCION VALIDA");
        }

    } while (opcion != 8);

//    IO.println(c1.infoCuentaBank().toUpperCase());
//    cuentaBank c1= new cuentaBank("ES12345678911235", "Fabiana sevilla");
//    Movimiento m1= new Movimiento(Tipo.RETIRADA, 135 );
//    IO.println(c1.infoCuentaBank()+"\n"+m1.infoMovimiento());


}