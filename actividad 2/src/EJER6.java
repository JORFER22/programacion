//Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado
import java.util.Scanner;
public class EJER6 {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        System.out.println("DIGITE UN NUMERO");
        int num= teclado.nextInt();
        int cont=1;

        while (cont<=num){
            System.out.println("CONTEO "+cont);
            cont++;
        }
    }
}