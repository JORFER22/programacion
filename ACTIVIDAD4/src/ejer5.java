//Crea un programa que pida veinte números reales por teclado, los almacene en un array
//y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        double[] numeros = new double[20];
        double suma = 0.0 ;
        for (int i = 0; i < numeros.length; i++) {
            Scanner teclado = new Scanner(System.in);
            IO.println("INTRODUCE EL NUMERO "+(i+1)+":");
            numeros[i]= teclado.nextInt();
            suma = suma + numeros[i];
        }
        double media = suma/numeros.length;
        IO.println("LA MEDIA ES "+media);

    }
}