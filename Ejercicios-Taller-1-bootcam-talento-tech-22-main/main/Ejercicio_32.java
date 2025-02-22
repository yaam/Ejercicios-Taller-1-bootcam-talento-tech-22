package main;

import java.util.Scanner;

public class Ejercicio_32 {
     /*
     * @param args Tendremos una clase main
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el monto total de la compra
        System.out.print("Ingrese el monto total de la compra (Bs.): ");
        double montoCompra = scanner.nextDouble();

        // Variables para almacenar los montos de cada tipo de pago
        double dineroPropio, prestamoBanco, creditoFabricante, intereses;

        if (montoCompra > 500000) {
            // Si el monto es mayor a 500,000 Bs.
            dineroPropio = montoCompra * 0.55;
            prestamoBanco = montoCompra * 0.30;
            creditoFabricante = montoCompra - (dineroPropio + prestamoBanco);
        } else {
            // Si el monto es menor o igual a 500,000 Bs.
            dineroPropio = montoCompra * 0.70;
            prestamoBanco = 0; // No se solicita préstamo al banco
            creditoFabricante = montoCompra - dineroPropio;
        }

        // Calcular los intereses del crédito al fabricante
        intereses = creditoFabricante * 0.20;

        // Mostrar los resultados
        System.out.println("\nDetalle de pagos:");
        System.out.printf("Dinero propio: Bs. %.2f%n", dineroPropio);
        System.out.printf("Préstamo al banco: Bs. %.2f%n", prestamoBanco);
        System.out.printf("Crédito al fabricante: Bs. %.2f%n", creditoFabricante);
        System.out.printf("Intereses del crédito: Bs. %.2f%n", intereses);
        System.out.printf("Total a pagar (incluyendo intereses): Bs. %.2f%n", montoCompra + intereses);

        scanner.close();
    }
}