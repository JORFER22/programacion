import java.util.Scanner;
void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("DIGITE EL PRIMER NUMERO");
    double num1= teclado.nextDouble();
    System.out.println("DIGITE EL SEGUNDO NUMERO");
    double num2= teclado.nextDouble();
    System.out.println("LOS NUMEROS SON IGUALES " +(num1=num2));
    System.out.println("EL NUMERO MAYOR ES "+ (num1>num2));

    
}