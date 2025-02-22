package main;

import java.util.Scanner;

public class Ejercicio_44 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números diferentes
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        // Determinar el número mayor
        int mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        // Imprimir el número mayor
        System.out.println("El número mayor es: " + mayor);

        // Cerrar el scanner
        scanner.close();
    }
}