import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        CollectionArraylist<Integer> numList = new CollectionArraylist<>();

        System.out.println("Ejercicio 1: ");
        System.out.println("Ingrese 10 números enteros: ");
        for (int i = 0; i<10; i++){
            System.out.print((i+1)+"- ");
            num = sc.nextInt();
            numList.addNum(num);
        }

        int highest = 0;
        for (int numIn : numList){
            if (highest < numIn){
                highest = numIn;
            }
        }
        System.out.println("El mayor número leído en el array es: "+highest);
    }
}
