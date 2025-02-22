package main;

import java.util.Scanner;

public class Ejercicio_9 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // creación del objeto
        Scanner scanner = new Scanner(System.in);
        // ingreso de dia de la fecha de hoy
        System.out.println("Ingrese la dia de hoy: ");
        int dia = scanner.nextInt();
        // ingreso de mes de la fecha de hoy
        System.out.println("Ingrese el mes de hoy: ");
        int mes = scanner.nextInt();
        // ingreso de año de la feha de hoy
        System.out.println("Ingrese el año de hoy:");
        int año = scanner.nextInt();

        // Calcular la fecha del día siguiente
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        dia++;
        if (dia > diasPorMes[mes - 1]) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;

            }
        }

        // Mostrar la fecha del día siguiente
        System.out.printf("La fecha del día siguiente es: %02d/%02d/%04d%n", dia, mes, año);

        scanner.close();
    }

}
