//Realiza un programa que lea un número positivo N y calcule y visualice su factorial N! Siendo el factorial:
import java.util.Scanner;
public class EJER8 {
    public static void main(String[] args) {
        IO.println("EJERCICIO 8");
        Scanner teclado = new Scanner(System.in);
        IO.println("Introduzca el valor del numero para calcular el factorial: ");
        int num = teclado.nextInt();
        double factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        IO.println(factorial);
    }

}
