package main;

import java.util.Scanner;

public class Ejercicio_15 {
    /*
     * @param args Tendremos una clase main
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el monto del préstamo
        System.out.print("Ingrese el monto del préstamo en euros: ");
        double monto = scanner.nextDouble();

        // Determinar el número de cuotas
        int cuotas;
        if (monto > 5000) {
            cuotas = 3;
        } else if (monto < 1000) {
            cuotas = 1;
        } else if (monto >= 2000 && monto <= 3000) {
            cuotas = 2;
        } else {
            cuotas = 5;
        }

        // Determinar la tasa de interés
        double tasaInteres;
        if (monto < 4000) {
            tasaInteres = 0.12; // 12%
        } else {
            tasaInteres = 0.10; // 10%
        }

        // Calcular el monto total con interés
        double montoTotal = monto * (1 + tasaInteres);

        // Calcular el monto de cada cuota
        double montoCuota = montoTotal / cuotas;

        // Mostrar los resultados
        System.out.println("Número de cuotas: " + cuotas);
        System.out.printf("Monto de cada cuota: %.2f euros%n", montoCuota);

        scanner.close();
    }
}