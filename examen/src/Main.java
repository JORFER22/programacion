/*
Se debe realizar un proyecto para crear el siguiente programa, este debe de seguir la siguiente
estructura.
 Debe de pedir la cantidad total de números a almacenar al iniciar el programa.
 Debe de generar un menú con la siguiente estructura:
o Modificar colección:
▪ Insertar número.
▪ Borrar número de una posición específica
▪ Modificar número de una posición específica.
o Estadísticas de la colección:
▪ Media de todos los valores no nulos.
▪ Suma de todos los valores.
▪ Máximo de la colección
▪ Mínimo de la colección
o Ampliar el valor de la colección.
o Salir.
 */
import java.util.Scanner;
public class Main {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("BIENVENIDO A MI PROGRAMA");
        IO.println("INSERTE LA CANTIDAD DE NUMEROS A ALMACENAR EN EL PROGRAMA y que sea mayor a 0");
        int cantidadNumeros= sc.nextInt();
        int sumaMedia = 0;
        if (cantidadNumeros>0) {
            int[] almacenamiento = new int[cantidadNumeros];
            double maxE3 = - Double.MAX_VALUE, minE3 = Double.MAX_VALUE;
                String opcion2;
                String opcion;
                String opcion3;
                do {
                    sc = new Scanner(System.in);
                    IO.println("INTRODUZCA UNA OPCION A REALIZAR \nM = Modificar colección \nE = ESTADISTICAS DE LA COLECCION\nA = Ampliar el valor de la colección.\nS = SALIR");
                    opcion = sc.nextLine();

                    if (opcion.equalsIgnoreCase("m") || opcion.equalsIgnoreCase("e") ||opcion.equalsIgnoreCase("A") ){
                        if (opcion.equalsIgnoreCase("m")) {
                            IO.println("QUE DESEA REALIZAR");
                            sc = new Scanner(System.in);
                            IO.println("▪I = Ingresar numero \n▪B = Borrar numero de una posicion especifica \n▪M = Modificar numero de una posicion especifica");
                            opcion2 = sc.nextLine();
                            if (opcion2.equalsIgnoreCase("I") || opcion2.equalsIgnoreCase("b") || opcion2.equalsIgnoreCase("m")) {
                                if (opcion2.equalsIgnoreCase("I")) {
                                    sc = new Scanner(System.in);
                                    for (int i = 0; i < almacenamiento.length; i++) {
                                        IO.println("INGRESA UN NUMERO EN LA POSICION: "+(i+1));
                                        int valor = sc.nextInt();
                                        almacenamiento[i] = valor;
                                        sumaMedia= sumaMedia + almacenamiento[i];
                                    }

                                } else if (opcion2.equalsIgnoreCase("B")) {
                                    sc = new Scanner(System.in);
                                    IO.println("INTRODUZCA LA POSICION DEL ALMACENAMINETO QUE QUIERE BORRAR");
                                    int borrar = sc.nextInt();
                                    IO.println("QUIERE BORRAR "+almacenamiento[borrar]);
                                    if (borrar >= 0 && borrar < almacenamiento.length) {
                                        almacenamiento[borrar] = 0;
                                    } else {
                                        IO.println("INTRODUZCA UN VALOR MAYOR A CERO");
                                    }
                                } else if (opcion2.equalsIgnoreCase("m")) {
                                    sc = new Scanner(System.in);
                                    IO.println("INGRESE LA POSICION DEL ALMACENAMIENTO QUE DESEA MODIFICAR");
                                    int modificarValor = sc.nextInt();
                                    if (modificarValor >= 0 && modificarValor < almacenamiento.length) {
                                        IO.println("INTRODUZCA EL VALOR A INGRESAR");
                                        int nuevoValor = sc.nextInt();
                                        almacenamiento[modificarValor] = nuevoValor;
                                    } else {
                                        IO.println("INTRODUZCA UN VALOR MAYOR A 0");
                                    }
                                }
                            } else {
                                IO.println("INTRODUZCA UNA OPCION VALIDA");
                            }
                        } else if (opcion.equalsIgnoreCase("e")){
                            sc = new Scanner(System.in);
                            IO.println("QUE DESEA REALIZAR");
                            IO.println("▪N = Media de todos los valores no nulos.\n▪S = Suma de todos los valores.\n▪C = Máximo de la colección\n▪M = Mínimo de la colección");
                            opcion3= sc.nextLine();
                            if (opcion3.equalsIgnoreCase("N") || opcion3.equalsIgnoreCase("S") || opcion3.equalsIgnoreCase("C") || opcion3.equalsIgnoreCase("M")) {
                                if (opcion3.equalsIgnoreCase("N")){
                                    int media = sumaMedia / almacenamiento.length;
                                    IO.println("LA MEDIA DE LOS VALORES ES: "+media);
                                } else if (opcion3.equalsIgnoreCase("S")) {
                                    IO.println("LA SUMA DE TODOS LOS VALORES ES "+sumaMedia);
                                } else if (opcion3.equalsIgnoreCase("C")) {
                                    IO.println("EL MAXIMO DE LA COLECCION ES: "+maxE3);
                                } else if (opcion3.equalsIgnoreCase("M")) {
                                    IO.println("EL MAXIMO DE LA COLECCION ES: "+minE3);
                                }
                            }else {
                                IO.println("NO ES UNA OPCION VALIDA");
                            }
                        }else if (opcion.equalsIgnoreCase("A")){
                            sc = new Scanner(System.in);
                            IO.println("INGRESE LA CANTIDAD A LA QUE SE QUIERE AMPLIAR EL ALMACENAMINETO");
                            int ampliar= sc.nextInt();
                            if (ampliar > 0){
                                int [] almacenamientoAux= new int [(almacenamiento.length + ampliar)];
                                for (int i = 0; i < almacenamientoAux.length; i++){
                                    almacenamientoAux[i]=almacenamiento[i];
                                }
                                almacenamiento = almacenamientoAux;
                            }else {
                                IO.println("EL NUMERO TIENE QUE SER MAYOR A 0");
                            }
                        }
                    }else if (opcion.equalsIgnoreCase("S")) {
                    IO.println("SALIENDO DEL SITEMA");
                    }else {
                        IO.println("INTRODUZCA UNA OPCION VALIDA");
                    }
                } while (!opcion.equalsIgnoreCase("S"));

        }else {
            IO.println("OPCION INVALIDA INTRODUZCA UN NUMERO MAYOR A 0 POR FAVOR");
        }

    }
}