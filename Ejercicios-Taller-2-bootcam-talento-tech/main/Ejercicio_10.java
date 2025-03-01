package main;

import java.util.Scanner;

/**
 * @description: clase principal del programa
 * @author yeison
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número para generar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Imprimir la tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int producto = numero * i;
            System.out.println(numero + " x " + i + " = " + producto);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
