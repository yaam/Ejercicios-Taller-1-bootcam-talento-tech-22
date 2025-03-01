package main;

import java.util.Scanner;

/**
 * @description: clase principal del programa
 * @author yeison
 */

public class Ejercicio_7 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar los 15 números
        int[] numeros = new int[15];

        // Leer 15 números negativos
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el número " + (i + 1) + " (debe ser negativo): ");
            numeros[i] = scanner.nextInt();

            // Verificar que el número sea negativo
            if (numeros[i] >= 0) {
                System.out.println("El número debe ser negativo. Intente de nuevo.");
                i--; // Repetir la entrada para este índice
            }
        }

        // Convertir los números negativos a positivos
        for (int i = 0; i < 15; i++) {
            numeros[i] = Math.abs(numeros[i]);
        }

        // Imprimir los números convertidos a positivos
        System.out.println("Los números convertidos a positivos son:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
