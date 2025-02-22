package main;

import java.util.Scanner;

public class Ejercicio_48 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad y la antigüedad en el empleo
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la antigüedad en el empleo (en años): ");
        int antiguedad = scanner.nextInt();

        // Determinar el tipo de jubilación
        if (edad >= 60 && antiguedad < 25) {
            System.out.println("La persona corresponde a la jubilación por edad.");
        } else if (edad < 60 && antiguedad >= 25) {
            System.out.println("La persona corresponde a la jubilación por antigüedad joven.");
        } else if (edad >= 60 && antiguedad >= 25) {
            System.out.println("La persona corresponde a la jubilación por antigüedad adulta.");
        } else {
            System.out.println("La persona no cumple con los requisitos para jubilarse en 2008.");
        }

        scanner.close();
    }
}