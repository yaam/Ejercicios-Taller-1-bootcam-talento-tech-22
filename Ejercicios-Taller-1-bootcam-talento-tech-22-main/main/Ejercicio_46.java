package main;

import java.util.Scanner;

public class Ejercicio_46 {
        /*
     * @param args Tendremos una clase main
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el salario mensual del trabajador
        System.out.print("Ingrese el salario mensual del trabajador: ");
        double salario = scanner.nextDouble();

        // Solicitar la antigüedad del trabajador en años
        System.out.print("Ingrese la antigüedad del trabajador en años: ");
        int antiguedad = scanner.nextInt();

        // Calcular la utilidad en función de la antigüedad
        double utilidad = calcularUtilidad(salario, antiguedad);

        // Mostrar la utilidad calculada
        System.out.println("La utilidad que recibe el trabajador es: " + utilidad);
    }

    public static double calcularUtilidad(double salario, int antiguedad) {
        double porcentajeUtilidad;

        if (antiguedad < 1) {
            porcentajeUtilidad = 0.05; // 5%
        } else if (antiguedad >= 1 && antiguedad < 2) {
            porcentajeUtilidad = 0.07; // 7%
        } else if (antiguedad >= 2 && antiguedad < 5) {
            porcentajeUtilidad = 0.10; // 10%
        } else if (antiguedad >= 5 && antiguedad < 10) {
            porcentajeUtilidad = 0.15; // 15%
        } else {
            porcentajeUtilidad = 0.20; // 20%
        }

        return salario * porcentajeUtilidad;
    }
}