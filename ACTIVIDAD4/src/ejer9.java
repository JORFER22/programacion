//Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
//enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
//y mostrará en qué posiciones del array aparece N.
import java.util.Scanner;
public class ejer9 {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        double[] num = new double [100];
        for (int i=0 ; i<num.length ;i++){
            num[i] = 1 + (int) (Math.random()*10);
        }
        IO.println("INTRODUCE N");
        int N= teclado.nextInt();
        if (N>=1 && N<=10){
            for (int e=0 ; e< num.length ; e++){
                if (N==num[e]){
                    IO.println("N SE ENCUENTRA EN LA POSICION: "+e);
                }
            }
        }else {
            IO.println("POR FAVOR LEA BIEN EL ENUNCIADO");
        }
    }
}