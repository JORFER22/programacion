///12. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
/// con distintas opciones:
/// a. Mostrar valores.
/// b. Introducir valor.
/// c. Salir
import java.util.Arrays;
import java.util.Scanner;
public class ejer12 {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        int[]valores= new int[10];
        String opcion = "c" ;
        do {
            IO.println("bienvenido a nuestro programa, escoja una opcion propuesta");

            IO.println("a. Mostrar valores");
            IO.println("b. Introducir valores");
            IO.println("c. salir");
            switch(opcion) {
                    case "a" ->{
                        IO.println(Arrays.toString(valores));

                    }
                    case "b" ->{
                        IO.println("POR FAVOR INTRODUSCA EL VALOR DEL NUMERO ENTEERO QUE QUIERE INSERTAR");
                        int v= teclado.nextInt();
                        IO.println("INTRODUZCA LA POSICION EN LA QUE QUIERE COLOCAR EL VALOR");
                        int p= teclado.nextInt();
                        if (p >= 0 && p < valores.length);
                    }
                    case "c" -> {


                    }
            }

        }while (!opcion.equals("c"));

    }
}