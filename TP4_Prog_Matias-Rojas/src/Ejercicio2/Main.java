package Ejercicio2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n;
        int posicion;
        String cadena;
        double[] valores = {9.38, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};

        try{
        System.out.print("Contenido del array antes de modificar:\n");
        for (int i = 0; i < valores.length; i++){
            System.out.printf("%.2f",valores[i]);
            System.out.println();
        }

        System.out.print("\n\nIntroduce la posición del array a modificar: ");
        cadena = sc.nextLine();
        posicion = Integer.parseInt(cadena);
        validarPosicion(posicion,valores.length);

        System.out.print("\nIntroduce el nuevo valor de la posición "+posicion+": ");
        n = sc.nextDouble();

        valores[posicion] = n;

        System.out.println("\nPosición a modificar: "+posicion);
        System.out.println("Nuevo valor: "+n);
        System.out.println("Contenido del array modificado:\n");
        for(int i = 0; i < valores.length; i++){
            System.out.printf("%.2f",valores[i]);
            System.out.println();
        }
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("El valor ingresado es inválido. Ingrese solo números enteros");
        }catch(InputMismatchException e){
            System.out.println("El valor ingresado es inválid. Ingrese solo números enteros o decimales");
        }
    }
    public static void validarPosicion(int posicion, int largoArray){
        if(posicion < 0 || posicion >= largoArray){
            throw new IndexOutOfBoundsException("La posición ingresada no es válida");
        }
    }

}
