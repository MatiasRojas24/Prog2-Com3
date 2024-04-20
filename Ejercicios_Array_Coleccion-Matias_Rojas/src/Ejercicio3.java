
public class Ejercicio3 {
    public static void main(String[] args) {

        CollectionArraylist<Integer> numList = new CollectionArraylist<>();
        System.out.println("Ejercicio 3: ");

        int count = 0;
        int num = 100;

        while (count < 10) {
            if (isPrime(num)) {
                numList.addNum(num);
                count++;
            }
            num++;
            if (num > 300) {
                break;
            }
        }

        System.out.println("Primeros 10 números primos entre el 100 y 300: ");
        for (int numIn : numList){
            System.out.println("- "+numIn);
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