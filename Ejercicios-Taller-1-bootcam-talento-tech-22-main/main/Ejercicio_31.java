package main;

import java.util.Scanner;

public class Ejercicio_31 {
     /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del artículo: ");
        String nombreArticulo = scanner.nextLine();

        System.out.print("Ingrese la clave del artículo (01 o 02): ");
        String clave = scanner.nextLine();

        System.out.print("Ingrese el precio original del artículo: ");
        double precioOriginal = scanner.nextDouble();

        // Calcular el descuento basado en la clave
        double descuento = 0;
        if (clave.equals("01")) {
            descuento = precioOriginal * 0.10;
        } else if (clave.equals("02")) {
            descuento = precioOriginal * 0.20;
        } else {
            System.out.println("Clave no válida. No se aplicará descuento.");
        }

        // Calcular el precio con descuento
        double precioConDescuento = precioOriginal - descuento;

        // Imprimir los resultados
        System.out.println("\nDetalles del artículo:");
        System.out.println("Nombre: " + nombreArticulo);
        System.out.println("Clave: " + clave);
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Precio con descuento: $" + precioConDescuento);

        scanner.close();
    }
}