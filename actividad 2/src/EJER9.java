//Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo
import java.util.Scanner;
public class EJER9 {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        IO.println("INTRODUZCA LA HORA");
        int hora= teclado.nextInt();
        IO.println("INTRODUZCA EL MINUTO");
        int min= teclado.nextInt();
        IO.println("INTRODUZCA LOS SEGUNDOS");
        int seg= teclado.nextInt();
        seg++;
        if (seg>=60){
            seg=0;
            min++;
            if (min>=60){
                min=0;
                hora++;
                if (hora>=24){
                    hora=0;
                }
            }
        }
        IO.println(hora+":"+min+":"+seg);
    }
}