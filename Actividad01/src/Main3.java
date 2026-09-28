import java.util.Scanner;
void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    System.out.println("INTRODUZCA EL LADO DE UN CUADRADO PARA CALCULAR SU AREA:");
    double lado= teclado.nextDouble();
    double area= lado * lado;
    System.out.println("EL AREA DE UN CUADRADO ES: "+area);
    teclado.close();

}