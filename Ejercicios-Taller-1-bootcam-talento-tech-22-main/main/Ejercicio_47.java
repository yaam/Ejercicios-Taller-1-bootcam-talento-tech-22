package main;

import java.util.Scanner;

public class Ejercicio_47 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el valor total de la compra
        System.out.print("Ingrese el valor total de la compra: ");
        double valorCompra = scanner.nextDouble();

        // Solicitar el color de la bolita
        System.out.print("Ingrese el color de la bolita (blanco, verde, amarilla, azul, roja): ");
        String colorBolita = scanner.next().toLowerCase();

        // Calcular el descuento según el color de la bolita
        double descuento = 0;
        switch (colorBolita) {
            case "blanco":
                descuento = 0;
                break;
            case "verde":
                descuento = 0.10;
                break;
            case "amarilla":
                descuento = 0.25;
                break;
            case "azul":
                descuento = 0.50;
                break;
            case "roja":
                descuento = 1.00;
                break;
            default:
                System.out.println("Color no válido. No se aplicará descuento.");
                break;
        }

        // Calcular el valor final a pagar
        double valorFinal = valorCompra * (1 - descuento);

        // Mostrar el valor final a pagar
        System.out.printf("El valor final a pagar es: %.2f%n", valorFinal);

        scanner.close();
    }
}