//Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
//utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
//cuántos valores del array son igual o superiores a R
import java.util.Scanner;
public class ejer8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double[] num = new double [100];
        for (int i=0 ; i<num.length ;i++){
            num[i] = Math.random();
        }
        int igual=0;
        IO.println("INTRODUZCA R: ");
        double R = teclado.nextDouble();
        if (R>=0.0 && R<=1.0){
            for(int e = 0; e < num.length ; e++){
                if (num[e]>=R){
                    igual++;
                }
            }
            IO.println("SON IGUALES: "+igual);
        }
    }
}