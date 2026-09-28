import java.util.Scanner;
void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    System.out.println("DIGITE LA DISTANCIA EN MILLAS MARINAS A TRANSFORMAR A METROS");
    double millas= teclado.nextDouble();
    double mm= 1.852;
    double m= mm*millas;
    System.out.println("LA DISTANCIA EN METROS SON: "+m);
    teclado.close();
    
}