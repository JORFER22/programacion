import java.util.Scanner;
public class EJER2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opci;
        do {
            IO.println("DIGITE EL PRIMER NUMERO");
            double num1 = teclado.nextDouble();
            IO.println("DIGITE EL SEGUNDO NUMERO");
            double num2 = teclado.nextDouble();
            IO.println("1 SUMAR\n2 RESTAR\n3 MULTIPLICAR\n4 DIVIDIR\n5 SALIR");
            opci = teclado.nextInt();
            switch (opci) {
                case 1 -> IO.println("RESULTADO: =" + (num1 + num2));
                case 2 -> IO.println("RESULTADO: =" + (num1 - num2));
                case 3 -> IO.println("RESULTADO: =" + num1 * num2);
                case 4 -> {
                    if (num2 == 0.0) {
                        IO.println("SYNTAX ERROR");
                    } else {
                        IO.println("RESULTADO: " + num1 / num2);
                    }
                }
                case 5 -> {
                    IO.println("ADIOS");
                    break;
                }
                default -> IO.println("OPCION NO VALIDA");
            }
        } while(opci != 5);

    }
}
