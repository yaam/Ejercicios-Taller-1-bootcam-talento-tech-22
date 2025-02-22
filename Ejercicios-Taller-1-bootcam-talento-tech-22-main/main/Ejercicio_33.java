package main;

import java.util.Scanner;

public class Ejercicio_33 {
    /*
     * @param args Tendremos una clase main
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el precio de una camisa
        final double precioCamisa = 25.0; // Puedes cambiar este valor según el precio real

        // Solicitar al usuario la cantidad de camisas compradas
        System.out.print("Ingrese la cantidad de camisas compradas: ");
        int cantidadCamisas = scanner.nextInt();

        // Calcular el total sin descuento
        double totalSinDescuento = cantidadCamisas * precioCamisa;

        // Aplicar el descuento según la cantidad de camisas
        double descuento;
        if (cantidadCamisas >= 3) {
            descuento = totalSinDescuento * 0.20; // 20% de descuento
        } else {
            descuento = totalSinDescuento * 0.10; // 10% de descuento
        }

        // Calcular el total a pagar con el descuento aplicado
        double totalConDescuento = totalSinDescuento - descuento;

        // Mostrar el resultado
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        scanner.close();
    }
}