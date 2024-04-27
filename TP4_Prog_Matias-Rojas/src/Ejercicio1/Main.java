package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int numGuess = 0;
        int tries = 0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        num = r.nextInt(1,100);
        System.out.println("He generado un número al azar entre 1 y 100. Intenta adivinarlo!");

        while (num != numGuess){
            numGuess=0;
            if (tries == 1){
                System.out.println("Llevas 1 intento!"+"\n");
            } else if (tries > 1) {
                System.out.println("Llevas "+tries+" intentos!"+"\n");
            }

            System.out.print("Ingrese su número: ");
            try {
                numGuess = sc.nextInt();

                if (numGuess != num) {
                    if (numGuess < num) {
                        System.out.println("Intenta con un número mayor!"+"\n");
                    }
                    if (numGuess > num) {
                        System.out.println("Intenta con un número menor!"+"\n");
                    }
                } else {
                    tries++;
                    System.out.println("Has adivinado el número! Felicidades!");
                    System.out.println("Te ha tomado " + tries + " intentos!");
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Porfavor, ingrese un número entero. Esto contará como un intento."+"\n");
                sc.next();
            }finally {
                tries++;
            }
        }
    }
}
