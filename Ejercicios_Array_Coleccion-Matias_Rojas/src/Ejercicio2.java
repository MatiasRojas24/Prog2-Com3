import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        CollectionArraylist<Integer> numList = new CollectionArraylist<>();

        System.out.println("Ejercicio 2: ");
        System.out.println("Ingrese 10 números enteros: ");
        for (int i = 0; i<10; i++){
            System.out.print((i+1)+"- ");
            num = sc.nextInt();
            numList.addNum(num);
        }

        int highestOddNumber = 0;
        for (int numIn : numList){
            if (numIn % 2 != 0 && isPrime(numIn)) {
                if (highestOddNumber < numIn) {
                    highestOddNumber = numIn;
                }
            }
        }

        if (highestOddNumber == 0){
            System.out.println("No se ha encontrado un número primo en el array");
        }else {
            System.out.println("El mayor número primo leído en el array es: " + highestOddNumber);
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}