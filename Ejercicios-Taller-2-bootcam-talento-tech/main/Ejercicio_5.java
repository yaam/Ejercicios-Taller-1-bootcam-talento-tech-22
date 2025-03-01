package main;
import java.util.Scanner;
/**
 *  @description: clase principal del programa
*   @author yeison 
*/
public class Ejercicio_5 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar los 10 números
        int[] numeros = new int[10];

        // Leer 10 números del usuario
        System.out.println("Por favor, introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Imprimir solo los números positivos
        System.out.println("Los números positivos son:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                System.out.println(numeros[i]);
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}