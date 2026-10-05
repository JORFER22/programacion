//Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez utiliza un contador sumando de 1 en 1.
public class EJER5 {
    public static void main(){
        int num=2;
        while (num<=200){
            if (num%2==0){
                System.out.println("LOS NUMEROS SON "+num);
            }
            num=num+1;

        }
    }
}