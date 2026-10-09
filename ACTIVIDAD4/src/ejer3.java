//Crea un programa que pida diez números reales por teclado, los almacene en un array,
//y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pa
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
public class ejer3 {
    public static void main (String[] args){
        int [] numeros =new int  [10];
        for (int i=0 ; i< numeros.length ; i++){
            Scanner teclado= new Scanner(System.in);
            IO.println("INTRODUCE LOS 10 NUMEROS");
            int ni= teclado.nextInt();
            numeros[i]=ni;
        }
        OptionalInt max =  Arrays.stream(numeros).max();
        OptionalInt min = Arrays.stream(numeros).min();
        IO.println("MAYOR: "+max);
        IO.println("MENOR: "+min);

    }
}