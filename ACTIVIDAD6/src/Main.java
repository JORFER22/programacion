import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        /*1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
        y luego muestre la matriz por pantalla.
         */
        /*int matriz[][] = new int[5][5];
        int contador= 1;
        for (int i = 0 ; i<matriz.length ; i++){
            for (int j = 0 ; j<matriz[i].length ; j++){
                matriz[i][j]= contador;
                contador++;
                IO.print(matriz[i][j] + " ");
            }
            IO.println(" ");
        }

         */



        /*2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
        multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
         */
        /*int matriz[][] = new int[10][10];

        for (int i = 0 ; i< matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i+1) * (j+1);
                IO.println((i+1) +" X "+ (j+1)+" = " +matriz[i][j]);
            }
            IO.println();
        }

         */




        /*3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
        introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
        matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
        menores que cero y cuántos son igual a cero.
         */
        /*IO.println("INTRODUCE N");
        int N= sc.nextInt();
        IO.println("INTRODUCE M");
        int M= sc.nextInt();
        int mayor0= 0 , menores0 = 0 , igual0 = 0 ;
        int matriz3[][] = new int[N][M];
        if (N>0 && M>0 ) {

            for (int i = 0; i < matriz3.length; i++) {
                for (int j = 0; j < matriz3[i].length; j++) {
                    IO.println("INTRODUCE LOS VALORES ");
                    int valor = sc.nextInt();
                    matriz3[i][j] = valor;
                    if (matriz3[i][j] > 0) {
                        mayor0++;
                    } else if (matriz3[i][j] == 0) {
                        igual0++;
                    } else if (matriz3[i][j] < 0) {
                        menores0++;
                    }
                }
            }
            IO.println("SON MAYORES A 0 = "+mayor0);
            IO.println("SON MENORES A 0 = "+menores0);
            IO.println("SON IGUALES A 0 = "+igual0);
        }else {
            IO.println("INTRODUZCA UN NUMERO POSITIVO");
        }

         */





        /*4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
        1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
        programa mostrará la nota mínima, máxima y media de cada alumno.
         */
        /*int alumnos= 4 , notas = 5 ;

        double matriz4[][]= new double[alumnos][notas];
        double estadistica[][]= new double[alumnos][3];//minima maxima y media

        for (int i = 0 ; i< matriz4.length ; i++) {
            for (int j = 0; j < matriz4[i].length; j++){
                IO.println("INTRODUZCA LA NOTAS "+ (j+1)+"DEL ESTUDIANTE :" );
                matriz4[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0 ; i< matriz4.length ; i++) {
            estadistica[i][0]= Double.MAX_VALUE;
            estadistica[i][1]= - Double.MAX_VALUE;
            estadistica[i][2]= 0.0;
            for (int j = 0; j < matriz4[i].length; j++){
                estadistica[i][0]= Math.min(estadistica[i][0], matriz4[i][j]);
                estadistica[i][1]= Math.max(estadistica[i][1], matriz4[i][j]);
                estadistica[i][2]= estadistica[i][2] + matriz4[i][j];
            }
            estadistica[i][2] = estadistica[i][2] / matriz4[i].length;

        }

         */




        /*5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
        y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
        de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
        género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única
        /matriz. Luego se mostrará por pantalla el sueldo medio de cada género.
         */
        IO.println("INTRODUZCA EL NUMERO DE PERSONAS");
        int nPersonas = sc.nextInt();

        int matriz5[][]= new int[nPersonas][2];
        double mediah= 0.0 , mediaM= 0.0;
        int contadorH= 0 , contadorM = 0 ;
        for (int i = 0 ; i< matriz5.length ; i++) {
            for (int j = 0; j < matriz5[i].length; j++){
                IO.println(" INGRESE EL GENERO DE LA PERSONA (0 HOMBRE, 1 MUJER)");
                matriz5[i][0] = sc.nextInt();
                IO.println(" INGRESE EL VALOR DEL SALARIO");
                matriz5[i][0] = sc.nextInt();
            }


    }
}
