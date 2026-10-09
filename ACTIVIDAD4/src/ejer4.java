//Crea un programa que pida veinte números enteros por teclado, los almacene en un
//array y luego muestre por separado la suma de todos los valores positivos y negativos
import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args){
        int[] numeros = new int[20];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            Scanner teclado = new Scanner(System.in);
            IO.println("INTRODUCE LOS 20 NUMEROS");
            int ni = teclado.nextInt();
            numeros[i] = ni;
            suma= suma+numeros[i];
        }
        IO.println("LA SUMA ES: "+suma);

    }
}