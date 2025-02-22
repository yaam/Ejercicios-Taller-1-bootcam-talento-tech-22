package main;

import java.util.Scanner;

public class Ejercicio_39 {
     /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su promedio
        System.out.print("Ingrese su promedio: ");
        double promedio = scanner.nextDouble();

        // Solicitar al usuario que ingrese el monto de la colegiatura
        System.out.print("Ingrese el monto de la colegiatura: ");
        double colegiatura = scanner.nextDouble();

        double montoAPagar;

        if (promedio >= 9) {
            // Aplicar descuento del 30% y no cobrar IVA
            montoAPagar = colegiatura * 0.7;
        } else {
            // Cobrar la colegiatura completa con el 10% de IVA
            montoAPagar = colegiatura * 1.10;
        }

        // Mostrar el monto que el alumno debe pagar
        System.out.println("El monto a pagar es: " + montoAPagar);

        scanner.close();
    }
}