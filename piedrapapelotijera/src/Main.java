//Explicarle al jugador cómo se juega.
// Generar la jugada aleatoria del ordenador.
// Pedir al jugador su jugada mediante una letra (P para piedra, L para papel, T para tijeras,
//o S para salir terminando la partida):
// Decidir quién ha ganado.
//Una cosa es saber como se juega y otra es saberlo programar, los pasos a seguir serían:
// Preparar el esqueleto y las constantes necesarias.
// Mostrar instrucciones al usuario.
// Generar la jugada del ordenador.
// Recoger la jugada del usuario.
// Interpretar la jugada del usuario.
// Mostrar el resultado de la jugada.
// Hacer el juego repetitivo.
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("BIENBENIDO AL JUEGO PIERDA, PAPEL O TIJERA");
        IO.println("INTRODUCE UNA DE LAS OPCIONES ");
        String opcion;
        do {
            IO.println("P = PIEDRA\nL = PAPEL\nT = TIJERAS\nS = SALIR ");
            opcion = sc.nextLine();
            int MAQUINA = (int) (Math.random()*3)+1;//aqui realice que el programa identifique los numeros como los objetos PIEDRA =1, PAPEL=2, TIJERA = 3
            if (opcion.equalsIgnoreCase("P")) {
                if (MAQUINA==1) {
                    IO.println("LA MAQUINA HA ELEJIDO PIEDRA");
                    IO.println("ES UN EMPATE");
                } else if (MAQUINA==2) {
                    IO.println("LA MAQUINA HA ELEJIDO PAPEL");
                    IO.println("LA MAQUINA HA GANADO");
                }else if (MAQUINA==3){
                    IO.println("LA MAQUINA HA ELEJIDO TIJERA");
                    IO.println("HAS GANADO");
                }
            }else if (opcion.equalsIgnoreCase("L")){
                if (MAQUINA==1) {
                    IO.println("LA MAQUINA HA ELEJIDO PIEDRA");
                    IO.println("HAS GANADO");
                } else if (MAQUINA==2) {
                    IO.println("LA MAQUINA HA ELEJIDO PAPEL");
                    IO.println("ES UN EMPATE");
                }else if (MAQUINA==3) {
                    IO.println("LA MAQUINA HA ELEJIDO TIJERA");
                    IO.println("LA MAQUINA HA GANADO");
                }
            } else if (opcion.equalsIgnoreCase("T")) {
                if (MAQUINA==1) {
                    IO.println("LA MAQUINA HA ELEJIDO PIEDRA");
                    IO.println("LA MAQUINA HA GANADO");
                } else if (MAQUINA==2) {
                    IO.println("LA MAQUINA HA ELEJIDO PAPEL");
                    IO.println("HAS GANADO");
                }else if (MAQUINA==3) {
                    IO.println("LA MAQUINA HA ELEJIDO TIJERA");
                    IO.println("ES UN EMPATE");
                }
            } else if (opcion.equalsIgnoreCase("S")) {
                IO.println("GRACIAS POR JUGAR");
            } else {
                IO.println("INTRODUCE UNA OPCION VALIDA");
            }
        }while (!opcion.equalsIgnoreCase("S"));
    }
}