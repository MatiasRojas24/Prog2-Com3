import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numsFinishedInFour = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        CollectionArraylist<Integer> numList = new CollectionArraylist<>();

        System.out.println("Ejercicio 4: ");
        System.out.println("Ingrese 10 números enteros: ");
        for (int i = 0; i<10; i++){
            System.out.print((i+1)+"- ");
            num = sc.nextInt();
            numList.addNum(num);
        }


        for (int numIn : numList){
            if (numIn % 10 == 4){
                numsFinishedInFour.add(numList.getIndex(numIn));
            }
        }

        System.out.println("Indices de los números terminados en 4 del array: ");
        for (int indexIn : numsFinishedInFour){
            System.out.println("- "+indexIn);
        }
    }
}