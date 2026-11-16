import java.util.Scanner;
import model.Movimiento;
import model.Tipo;

void main(String[] args) {
    final String patternIban = "^[A-Za-z]{2}\\d{22}$";
    final String patternEuro = "^\\\\d+[.,]\\\\d{2}$";
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
                //para llamar a la estructura de la informacion de la cuenta y que la pinte
                IO.println(c1.infoCuentaBank().toUpperCase());
            } else if (opcion==2) {
                //solo llamar el IBAN con el get y asi mismo que este en mayusculas y un salto de linea
                IO.println("EL IBAN ES : "+c1.getIban().toUpperCase()+"\n");

            } else if (opcion==3) {
                //solo llamar al titular con el get y el upper para ponermo en mayusculas y un salto de linea
                IO.println("EL NOMBRE DEL TITULAR ES : "+c1.getTitular().toUpperCase()+"\n");

            } else if (opcion==4) {
                //solo llamar el saldo con el get y en todos realizar un salto de linea para separar
                IO.println("EL SALDO DE LA CUENTA ES : "+c1.getSaldo()+"\n");

            } else if (opcion==5) {
                IO.println("INGRESE LA CANTIDAD QUE QUIERE INGRESAR A SU CUENTA, ESTE DIGITO TIENE QUE SER MAYOR A 0");
                 double ingreso = sc.nextDouble();
                 //validacion de digitos para ser grabados en movimientos
                if (ingreso>0.0 && ingreso<3000.0){
                    c1.ingreso(ingreso);//aqui se llama al metodo el cual valida y graba
                    IO.println("CANTIDAD INGRESADA CORRECTAMENTE");
                }else if (ingreso>=3000.0){
                    //notificacion y aviso de notificar a hacienda
                    IO.println("¡AVISO!: NOTIFICAR A HACIENDA");
                    IO.println("CANTIDAD INGRESADA CORRECTAMENTE");
                    c1.ingreso(ingreso);
                }else {
                    //no graba y notifica que se ingrse una cantidad valida
                    IO.println("POR FAVOR INGRESE UNA CANTIDAD VALIDA");
                }

            }else if (opcion==6) {
                //retirada
                IO.println("INGRESE LA CANTIDAD QUE QUIERE RETIRAR DE SU CUENTA, ESTE DIGITO TIENE QUE SER MAYOR A 0");
                double retiro= sc.nextDouble();
                if (retiro>0.0){
                    //validacion dependiendo del caso que acuerde
                    if ((c1.getSaldo()-retiro)>=-50){
                        IO.println("EL RETIRO HA SIDO EXITOSO\n");
                        c1.retiro(retiro);
                        if (c1.getSaldo()<0){
                            IO.println("SU SALDO ES NEGATIVO\n");
                        }
                    }else {
                        IO.println("FONDOS INSUFICIENTES\n");
                    }
                }else {
                    IO.println("INGRESE UNA CANTIDAD VALIDA\n");
                }
            } else if (opcion==7) {
                IO.println("MOSTRANDO HISTORIAL \n");
                IO.println(c1.totalMovimientos());

            } else if (opcion==8) {
                IO.println("SALIENDO DEL SISTEMA \nMUCAHS GRACIAS POR PREFERIR DAWBANK");

            }

        } else {
            IO.println("NO ES UNA OPCION VALIDA \n");
        }

    } while (opcion != 8);

}