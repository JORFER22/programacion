//Crea un programa que pida veinte números reales por teclado, los almacene en un array
//y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            Scanner teclado = new Scanner(System.in);
            IO.println("INTRODUCE LOS 20 NUMEROS");
            int ni = teclado.nextInt();
            numeros[i] = ni;
            suma = suma + numeros[i];
        }
        int media = suma/numeros.length;
        IO.println("LA MEDIA ES "+media);

    }
}