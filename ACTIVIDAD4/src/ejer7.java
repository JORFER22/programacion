//Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
//todos los valores desde P hasta Q, y lo muestre por pantalla.
import java.util.Scanner;
public class ejer7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        IO.println("INTRODUCE P");
        int P= teclado.nextInt();
        IO.println("INTRODUCE Q");
        int Q = teclado.nextInt();
        int valor = Math.abs(P-Q) + 1;
        int [] variable = new int[valor];
        for (int i = 0 ; i < variable.length ; i++){
            if (Q>P){
                variable[i]=P+i;
            }else {
                variable[i]=Q+i;
            }
            IO.println(variable[i]);
        }
    }
}