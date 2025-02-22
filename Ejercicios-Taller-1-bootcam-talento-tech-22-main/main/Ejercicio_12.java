package main;

import java.util.Scanner;

public class Ejercicio_12 {
    /*
     * @param args Tendremos una clase main
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una fecha en formato dd:mm:aaaa: ");
        String fecha = scanner.nextLine();

        // Dividir la fecha en día, mes y año
        String[] partes = fecha.split(":");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);

        // Validar la fecha
        if (esFechaValida(dia, mes, año)) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }

        scanner.close();
    }

    public static boolean esFechaValida(int dia, int mes, int año) {
        // Validar el año
        if (año <= 0) {
            return false;
        }

        // Validar el mes
        if (mes < 1 || mes > 12) {
            return false;
        }

        // Validar el día
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Ajustar febrero para años bisiestos
        if (mes == 2 && esBisiesto(año)) {
            diasPorMes[1] = 29;
        }

        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }

    public static boolean esBisiesto(int año) {
        // Un año es bisiesto si es divisible por 4, pero no por 100, a menos que también sea divisible por 400
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
    

