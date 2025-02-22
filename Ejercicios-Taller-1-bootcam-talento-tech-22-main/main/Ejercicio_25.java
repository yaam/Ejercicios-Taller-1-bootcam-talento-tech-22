package main;

import java.util.Scanner;

public class Ejercicio_25 {
    /*
     * @param args Tendremos una clase main
     */

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Solicitar el segundo número
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Ordenar los números en forma ascendente
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        // Imprimir los números ordenados
        System.out.println("Los números ordenados en forma ascendente son: " + numero1 + " y " + numero2);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
