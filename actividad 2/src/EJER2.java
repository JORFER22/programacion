//Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”
import java.util.Scanner;
public class EJER2 {
    public static void main(String[] args){
        Scanner teclado =  new Scanner(System.in);
        System.out.println("DIGITE SU EDAD: ");
        int edad= teclado.nextInt();
        if (edad>=18){
            System.out.println("ERES MAYOR DE EDAD");
        }
        if (edad<=17){
            System.out.println("ERES MENOR DE EDAD");
        }
    }
}