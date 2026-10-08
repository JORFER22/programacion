//Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores
import java.util.Scanner;
public class ejer1 {
    public static void main(String[] args){
        int [] numeros=new int  [10];
        for (int i=0 ; i< numeros.length ; i++){
            Scanner teclado= new Scanner(System.in);
            IO.println("INTRODUCE LOS 10 NUMEROS");
            int ni= teclado.nextInt();
            numeros[i]=ni;
        }
        for (int e = 0 ; e< numeros.length ; e++ ){
            IO.println("LOS NUMEROS SON "+ numeros[e]);
        }
    }
}