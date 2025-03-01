package main;

import java.util.Scanner;
/**
 * @description: clase principal del programa
 * @author yeison
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        //crea el objeto 
        Scanner scanner = new Scanner(System.in);
        //se le solicita el precio por kilo de naranja
        System.out.print("Ingrese el precio por kilo de naranjas: ");
        double precioPorKilo = scanner.nextDouble();
        
        double totalTienda = 0.0;
        //se realiza las iteración por 15 cliente
        //se realiza calculo por kilos
        for (int i = 1; i <= 15; i++) {
            System.out.print("Ingrese los kilos comprados por el cliente " + i + ": ");
            double kilos = scanner.nextDouble();
            
            double totalPagar = kilos * precioPorKilo;
            if (kilos > 10) {
                totalPagar *= 0.85; // Aplicar 15% de descuento
            }
            
            System.out.printf("Cliente %d: %.2f%n", i, totalPagar);
            totalTienda += totalPagar;
        }
        
        System.out.printf("Total percibido por la tienda: %.2f%n", totalTienda);
        scanner.close();
    }
}
