//Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en calificación alfabética, escribiendo el resultado
import java.util.Scanner;
public class EJER7 {
    public static void main(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("DIGITE SU NOTA");
        int not= teclado.nextInt();
        if (not<3){
            System.out.println("MUY DEFICIENTE");
        }else if (not<5){
            System.out.println("INSUFICIENTE");

        }else if (not<6){
            System.out.println("BIEN");

        }else if (not<9){
            System.out.println("NOTABLE");
        }else if (not<=10){
            System.out.println("SOBRESALIENTE");
        }

    }
}