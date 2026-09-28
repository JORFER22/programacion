import java.util.Scanner;
void main(String[] args) {
    Scanner teclado =new Scanner(System.in);
    System.out.println("DIGITE EL PRIMER NUMERO");
    double num1= teclado.nextDouble();
    System.out.println("DIGITE EL SEGUNDO NUMERO");
    double num2= teclado.nextDouble();
    System.out.println("DIGITE EL TERCER NUMERO");
    double num3= teclado.nextDouble();
    System.out.println("EL NUMERO MAYOR ES "+Math.max(num3,Math.max(num1,num2)) );
    
}