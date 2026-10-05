import java.util.Scanner;
        public class Main {
    public static void main(String[] args){
        //escribe un progrma que pide la edad por tecladop y nos muestra un mensaje "ERES MAYOR DE EDAD" en caso de que lo sea
        Scanner teclado =  new Scanner(System.in);
        System.out.println("DIGITE SU EDAD: ");
        int edad= teclado.nextInt();
        if (edad>=18){
            System.out.println("ERES MAYOR DE EDAD");

        }
    }
}