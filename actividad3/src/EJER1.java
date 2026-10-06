import java.util.Scanner;
public class EJER1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        IO.println("INTRODUZCA LOS EUROS");
        int dinero = teclado.nextInt();
        if (dinero % 5 == 0) {
            int[] billetes = new int[]{500, 200, 100, 50, 20, 10, 5};
            for(int i = 0; i < 7; ++i) {
                int billeteActual = billetes[i];
                int cantidadBilletes = dinero / billeteActual;
                dinero %= billeteActual;
                if (cantidadBilletes > 0) {
                    IO.println(cantidadBilletes + " BILLETES DE " + billeteActual + " euro");
                }
            }
        } else {
            IO.println("EL NUMERO QUE HA INTRODUCIDO NO ES MULTIPLO DE 5");
        }

    }
}
