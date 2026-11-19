import java.util.Scanner;

public class mitools {

    private static String Sysytem;

    public static double leerDOublePantalla(String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextDouble();
    }

    public static String leerTextoPantalla(String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextLine();
    }

    public static boolean comprobarPatron (String patron, String texto){
        boolean isOk= false;
        isOk= texto.matches(patron);
        return isOk;
    }

    public static String comprobarPatronRepetidamente(String patron, String mensaje){
        boolean isOk= false;
        String texto= "";
        do {
            texto= mitools.leerTextoPantalla(mensaje);
            isOk= mitools.comprobarPatron(patron, texto);
            if (!isOk){
                IO.println("El formato es incorrecto, introduce uno correcto");
            }

        }while (!isOk);
        return texto;
    }


}
