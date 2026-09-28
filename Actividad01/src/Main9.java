import java.util.Scanner;
void main(String[] args) {
    //escribe un programa que lea dos numeros y muestre sus sumas,restas, producto y division
    Scanner teclado= new Scanner(System.in);
    System.out.println("ESCRIBA EL PRIMER NUMERO");
    double num1= teclado.nextDouble();
    System.out.println("ESCRIBA EL SEGUNDO NUMERO");
    double num2= teclado.nextDouble();
    double suma= num1+num2;
    double resta= num1-num2;
    double mul= num1*num2;
    double div= num1/num2;
    System.out.println("SU SUMA ES: "+suma);
    System.out.println("SU RESTA ES: "+resta);
    System.out.println("SU PRODUCTO ES: "+mul);
    System.out.println("SU DIVISION ES: "+div);
    teclado.close();
}