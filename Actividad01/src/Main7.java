import java.util.Scanner;
void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    System.out.println("DIGITE EL PRIMER NUMERO: ");
    double num1= teclado.nextDouble();
    System.out.println("DIGITE EL SEGUNDO NUMERO");
    double num2= teclado.nextDouble();
    double mayor = Math.max(num1,num2);
    double menor = Math.min(num1,num2);
    System.out.println("NUMEROS ORDENADOS DE FORMA ASCENDENTE: "+menor+ "y" +mayor);
    teclado.close();


}