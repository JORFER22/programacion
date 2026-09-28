import java.util.Scanner;
void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    System.out.println("INTRODUZCA EL RADIO PARA CALCULAR LA CIRCUNFERENFIA, EL AREA Y EL VOLUMEN DE UNA ESFERA: ");
    double rad= teclado.nextDouble();
    double cir= 2*rad*Math.PI ;
    double area= (rad*rad)*Math.PI;
    double vol= 4/3.0*Math.PI*(rad*rad*rad);
    System.out.println("LA CIRCUNFERENCIA ES "+cir);
    System.out.println("EL AREA ES: "+area);
    System.out.println("EL VOLUMEN DE LA ESFERA ES: "+vol);
    teclado.close();

}