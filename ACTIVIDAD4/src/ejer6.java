// Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
//N, escriba M en todas sus posiciones y lo muestre por pantalla
import java.util.Arrays;
import java.util.Scanner;
public class ejer6 {
    public static void main (String[] args){
        Scanner teclado= new Scanner(System.in);
        IO.println("INTRODUCE EL NUMERO DE LAS VARIABLES");
        int N= teclado.nextInt();
        IO.println("INTRODUCE EL VALOR A ESCRIBIR");
        int M= teclado.nextInt();
        int[] variable= new int[N];
        Arrays.fill(variable,M);
        for (int i : variable){
            IO.println(i);
        }
    }
}
