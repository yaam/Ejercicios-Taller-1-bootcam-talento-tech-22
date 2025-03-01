package main;

import java.util.Scanner;

/**
 * @description: clase principal del programa
 * @author yeison
 */

public class Ejercicio_8 {

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el valor de N
        System.out.print("Ingrese la cantidad de números (N): ");
        int N = scanner.nextInt();

        // Verificar que N sea un número positivo
        if (N <= 0) {
            System.out.println("El valor de N debe ser mayor que 0.");
            return;
        }

        // Declarar un array para almacenar los N números reales
        double[] numeros = new double[N];

        // Solicitar al usuario que ingrese los N números reales
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular la suma de los números
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }

        // Calcular la media aritmética
        double media = suma / N;

        // Mostrar la suma y la media aritmética
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media aritmética es: " + media);

        // Cerrar el scanner
        scanner.close();
    }
}