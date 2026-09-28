import java.util.Scanner;
void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    System.out.println("DIGITE EL PRECIO DE VENTA");
    double pv= teclado.nextDouble();
    System.out.println("DIGITE EL PRECIO REAL");
    double pr= teclado.nextDouble();
    double des= ((pr-pv)/pr)*100;
    System.out.println("EL DESCUENTO ES "+des+"%");
    
}