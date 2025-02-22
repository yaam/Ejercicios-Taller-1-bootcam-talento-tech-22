package main;

import java.util.Scanner;

public class Ejercicio_22 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el monto de la compra
        System.out.print("Ingrese el monto de la compra (Bs.): ");
        double montoCompra = scanner.nextDouble();

        // Definir el monto mínimo para aplicar el descuento
        double montoMinimoDescuento = 1000.0;
        double descuento = 0.20; // 20% de descuento

        // Calcular el total a pagar
        double totalPagar;
        if (montoCompra > montoMinimoDescuento) {
            // Aplicar descuento si la compra supera los Bs. 1.000
            totalPagar = montoCompra - (montoCompra * descuento);
            System.out.println("Se aplicó un descuento del 20%.");
        } else {
            // No aplicar descuento
            totalPagar = montoCompra;
            System.out.println("No se aplicó descuento.");
        }

        // Mostrar el total a pagar
        System.out.printf("El total a pagar es: Bs. %.2f%n", totalPagar);

        // Cerrar el scanner
        scanner.close();
    }
}