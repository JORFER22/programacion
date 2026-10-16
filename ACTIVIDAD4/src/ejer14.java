import java.util.Arrays;

//Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
//valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
//muestre por pantalla
public class ejer14 {
    public static void main(String[] args){
        int num = 10;
        int tamanoArray= num* (num+1)/2; //suma de la serie aritmetica
        int numeros[]= new int[tamanoArray];

        int indiceActual = 0 ;
        for (int array = 1 ; array <= num; array++){
            for (int i= 0 ; i < array; i++){
                numeros[indiceActual]= array;
                indiceActual++;
            }
        }
        IO.println(Arrays.toString(numeros));
    }
}