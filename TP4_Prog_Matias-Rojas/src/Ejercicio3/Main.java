package Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double base;
        double height;
        double area;

        try {
            System.out.print("Ingrese la base: ");
            base = sc.nextDouble();

            System.out.print("Ingrese la altura: ");
            height = sc.nextDouble();

            area = (base * height) / 2;

            System.out.printf("El área del triángulo es: %.2f", area);
        }catch(InputMismatchException e){
            System.out.println("Valor ingresado inválido. Ingrese únicamente valores numéricos");
        }
    }
}
