import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result;
        int num1=0;
        int num2=0;
        boolean active = true;
        int option;
        while(active){
            option = 0;
            System.out.println("Qué desea hacer?");
            System.out.println("1. Sumar"+"\n"+
                    "2. Restar"+"\n"+
                    "3. Multiplicar"+"\n"+
                    "4. Dividir"+"\n"+
                    "0. Salir");
            option = sc.nextInt();
            switch (option){
                case 1:
                    num1 = inputNum();
                    num2 = inputNum();
                    add(num1,num2);
                    break;
                case 2:
                    num1 = inputNum();
                    num2 = inputNum();
                    subtract(num1,num2);
                    break;
                case 3:
                    num1 = inputNum();
                    num2 = inputNum();
                    multiply(num1,num2);
                    break;
                case 4:
                    num1 = inputNum();
                    num2 = inputNum();
                    divide(num1,num2);
                    break;
                case 0:
                    System.out.println("Cerrando programa...");
                    active = false;
                    break;
            }
        }
    }
    public static int inputNum(){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número: ");
        try {
            num = sc.nextInt();
            return num;
        }catch (InputMismatchException e){
            System.out.println("Error: debe ingresar un número");
        }
        return 0;
    }
    public static void add(int num1, int num2){
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
    public static void subtract(int num1, int num2){
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }
    public static void multiply(int num1, int num2){
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
    }
    public static void divide(int num1, int num2){
        try {
            System.out.println(num1+" / "+num2+" = "+(num1 / num2));
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
