//Crea un programa que permita al usuario almacenar una secuencia aritmética en un
//array y luego mostrarla. Una secuencia aritmética es una serie de números que
//comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1
//e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El
//programa solicitará al usuario V, I además de N (nº de valores a crear).
import java.util.Arrays;
import java.util.Scanner;
public class ejer13 {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        IO.println("introduce el valor inicial v");
        int v= teclado.nextInt();
        IO.println("introduce el incremento de la serie");
        int incremento= teclado.nextInt();
        IO.println("Introduce el numero de elementos a crear");
        int num= teclado.nextInt();
        int[]array= new int[num];
        array[0]= v;
        for (int i=1 ; i <array.length ; i++){
            array[i]= array[i+1] + incremento;
        }
        IO.println(Arrays.toString(array));

    }
}