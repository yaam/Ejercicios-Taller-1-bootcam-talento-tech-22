package main;

import java.util.Scanner;

public class Ejercicio_23 {
    /*
     * @param args Tendremos una clase main
     */

    // Función para calcular el valor de N
    public static int calcularN(int año) {
        int A = año % 19;
        int B = año % 4;
        int C = año % 7;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int N = 22 + D + E;
        return N;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el año
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        // Calcular el valor de N
        int N = calcularN(año);

        // Determinar el día y el mes
        int dia;
        String mes;

        if (N > 31) {
            dia = N - 31;
            mes = "abril";
        } else {
            dia = N;
            mes = "marzo";
        }

        // Mostrar el resultado
        System.out.println("El Domingo de Pascua en el año " + año + " será el " + dia + " de " + mes + ".");

        scanner.close();
    }
}
