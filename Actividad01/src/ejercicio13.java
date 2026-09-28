import java.util.Scanner;
void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("DIGITE EL NUMERO");
    double num1= teclado.nextDouble();
    System.out.println("EL NUMERO ES POSITIVO: "+(num1>=0));
    System.out.println("EL NUMERO ES NEGATIVO: "+(num1<=0));


}