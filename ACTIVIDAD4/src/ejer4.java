//Crea un programa que pida veinte números enteros por teclado, los almacene en un
//array y luego muestre por separado la suma de todos los valores positivos y negativos
import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args){
        int[] numeros = new int[20];
        int suma = 0;
        int posi = 0 , neg = 0;
        for (int i = 0; i < numeros.length; i++) {
            Scanner teclado = new Scanner(System.in);
            IO.println("INTRODUCE EL NUMERO "+(i+1));
            numeros[i] = teclado.nextInt();
            if (numeros[i]<0){
                neg+=numeros[i];
            }else {
                posi+=numeros[i];
            }
        }
        IO.println("LA SUMA DE LOS VALORES POSITIVO ES: "+posi);
        IO.println("LA SUMA DE LOS VALORES NEGATIVOS ES: "+neg);

    }
}