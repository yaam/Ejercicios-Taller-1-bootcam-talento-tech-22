package main;

import java.util.Scanner;

public class Ejercicio_52 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio sin IVA
        System.out.print("Ingrese el precio sin IVA del estéreo: ");
        double precioSinIVA = scanner.nextDouble();

        // Solicitar la marca del estéreo
        System.out.print("Ingrese la marca del estéreo: ");
        String marca = scanner.next();

        // Aplicar descuento del 10% si el precio es mayor o igual a 2000
        if (precioSinIVA >= 2000) {
            precioSinIVA *= 0.90; // Aplicar descuento del 10%
        }

        // Aplicar descuento del 5% si la marca es "NOSY"
        if (marca.equalsIgnoreCase("NOSY")) {
            precioSinIVA *= 0.95; // Aplicar descuento del 5%
        }

        // Calcular el IVA (16%)
        double iva = precioSinIVA * 0.16;

        // Calcular el precio final con IVA incluido
        double precioFinal = precioSinIVA + iva;

        // Mostrar el precio final
        System.out.printf("El precio final a pagar es: Bs. %.2f%n", precioFinal);

        scanner.close();
    }
}