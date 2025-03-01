package main;

import java.util.Scanner;
/**
 *  @description: clase principal del programa
*   @author yeison 
*/

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcular y mostrar el cubo y la cuarta de cada número
        for (int i = 0; i < 10; i++) {
            int cubo = numeros[i] * numeros[i] * numeros[i];
            int cuarta = numeros[i] * numeros[i] * numeros[i] * numeros[i];
            System.out.println("Número: " + numeros[i] + ", Cubo: " + cubo + ", Cuarta: " + cuarta);
        }

        scanner.close();
    }
}

