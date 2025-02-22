package main;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_35 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();
        
        // Generar un número aleatorio entre 0 y 99
        int numeroAleatorio = random.nextInt(100);
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el total de la compra
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();
        
        // Calcular el descuento según el número aleatorio
        double descuento;
        if (numeroAleatorio < 74) {
            descuento = totalCompra * 0.15; // 15% de descuento
        } else {
            descuento = totalCompra * 0.20; // 20% de descuento
        }
        
        // Mostrar el número aleatorio, el descuento y el total con descuento
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar después del descuento: $" + (totalCompra - descuento));
        
        // Cerrar el scanner
        scanner.close();
    }
}