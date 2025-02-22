package main;

import java.util.Scanner;

public class Ejercicio_49 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // Precio de cada computadora
        final int PRECIO_COMPUTADORA = 4000;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de computadoras que desea comprar
        System.out.print("Ingrese el número de computadoras que desea comprar: ");
        int cantidad = scanner.nextInt();

        // Calcular el total sin descuento
        int totalSinDescuento = cantidad * PRECIO_COMPUTADORA;

        // Calcular el descuento según la cantidad de computadoras
        double descuento = 0;
        if (cantidad < 5) {
            descuento = totalSinDescuento * 0.10;
        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = totalSinDescuento * 0.20;
        } else if (cantidad >= 10) {
            descuento = totalSinDescuento * 0.40;
        }

        // Calcular el total con descuento
        double totalConDescuento = totalSinDescuento - descuento;

        // Mostrar los resultados
        System.out.println("Total sin descuento: Bs. " + totalSinDescuento);
        System.out.println("Descuento aplicado: Bs. " + descuento);
        System.out.println("Total con descuento: Bs. " + totalConDescuento);

        // Cerrar el scanner
        scanner.close();
    }
}
