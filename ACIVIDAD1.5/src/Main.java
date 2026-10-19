import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner Sc= new Scanner(System.in);
        //1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada
        //palabra de la cadena en una línea distinta.
        /*IO.println("introduce una cadena de texto");
        String texto= Sc.nextLine();
        IO.println(texto.replace(" ", "\n"));

         */



        //2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
        //iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
        /*IO.println("INTRODUZCA LA PRIMERA CADENA DE TEXTO ");
        String cadena1= Sc.nextLine();
        IO.println("INTRODUZCA LA SEGUNDA CADENA DE TEXTO ");
        String cadena2 = Sc.nextLine();
        if(cadena1.equals(cadena2)){
            IO.println("LAS CADENAS SON IGUALES");
        } else if ((cadena1.equalsIgnoreCase(cadena2)) {
            IO.println("LAS CADENAS SON IGUALES IGNORANDO LAS MAYUSCULAS Y MINUSCULAS");

        }else {
            IO.println("LAS CADENAS SON DIFERENTES");
        }


         */


        //3. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
        //Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
        //las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
        //“Tarazón” y “Alcocer” mostrará “LIOTARALC”.
        /*IO.println("INTRODUZCA UN NOMBRE ");
        String cadena3 = Sc.nextLine();
        IO.println("INTRODUZCA EL PRIMER APELLIDO ");
        String cadena4 = Sc.nextLine();
        IO.println("INTRODUZCA EL SEGUNDO APELLIDO ");
        String cadena5 = Sc.nextLine();
        String codigo= (cadena3.substring(0,3)+cadena4.substring(0,3)+cadena5.substring(0,3)).toUpperCase();
        IO.println("EL CODIGO ES "+codigo);

         */




        //4. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
        //‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
        //mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:
        //Nº de A's: 3
        //Nº de E's: 1
        //Nº de I's: 2
        //Nº de O's: 0
        //Nº de U's: 0
        /*IO.println("INTRODUZCA LA FRASE");
        String frase= Sc.nextLine();
        int aes= 0 , ees= 0 , ies= 0 , oes= 0 , ues= 0 ;
        for (char c : frase.toLowerCase().toCharArray()){
            switch (c){
                case 'a' -> aes++;
                case 'e' -> ees++;
                case 'i' -> ies++;
                case 'o' -> oes++;
                case 'u' -> ues++;
            }
        }
        IO.println("Nº de A's: "+aes);
        IO.println("Nº de E's: "+ees);
        IO.println("Nº de I's: "+ies);
        IO.println("Nº de O's: "+oes);
        IO.println("Nº de U's: "+ues);

         */

        //5. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        //o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
        //Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
        //acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
        //derecha a izquierda.
        //Por ejemplo:
        //Amigo no gima
        //Dabale arroz a la zorra el abad
        //Amo la pacífica paloma
        //A man a plan a canal Panama
        IO.println("introduzca la frase que desee");
        String frase2 = Sc.nextLine();
        String fraseprocesada = frase2.replace(" ","").toLowerCase();
        boolean ispalindromo= true ;
        int izquierda = 0;
        int derecha = fraseprocesada.length() - 1;
        while (izquierda<derecha){
            if (fraseprocesada.charAt(izquierda) != fraseprocesada.charAt(derecha)){
                ispalindromo= false;
                break;
            }
            izquierda++;
            derecha--;

        }
        IO.println("LA FRASE ES UN PALINDROMO "+ispalindromo);
    }
}