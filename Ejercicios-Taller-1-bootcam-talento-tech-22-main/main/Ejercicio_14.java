package main;

import java.util.Scanner;

public class Ejercicio_14 {
    /*
     * @param args Tendremos una clase main
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio de coste del artículo
        System.out.print("Ingrese el precio de coste del artículo (en Bs.): ");
        double precioCoste = scanner.nextDouble();

        // Calcular la ganancia según el precio de coste
        double ganancia;
        if (precioCoste < 3) {
            ganancia = precioCoste * 0.15; // 15% de ganancia
        } else if (precioCoste >= 3 && precioCoste <= 6) {
            ganancia = 0.50; // 50 céntimos de ganancia
        } else {
            ganancia = precioCoste * 0.25; // 25% de ganancia
        }

        // Calcular el precio de venta (PVP)
        double pvp = precioCoste + ganancia;

        // Mostrar el resultado
        System.out.printf("El precio de venta (PVP) del artículo es: Bs. %.2f%n", pvp);

        scanner.close();
    }
}