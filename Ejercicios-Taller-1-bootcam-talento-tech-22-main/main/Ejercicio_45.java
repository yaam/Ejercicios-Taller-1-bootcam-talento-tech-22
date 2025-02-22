package main;

import java.util.Scanner;

public class Ejercicio_45 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las horas trabajadas y el salario por hora
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el salario por hora: ");
        double salarioPorHora = scanner.nextDouble();

        // Calcular el salario total
        double salarioTotal = calcularSalario(horasTrabajadas, salarioPorHora);

        // Mostrar el resultado
        System.out.printf("El salario total es: $%.2f%n", salarioTotal);

        scanner.close();
    }

    public static double calcularSalario(int horasTrabajadas, double salarioPorHora) {
        double salarioTotal = 0;

        // Horas normales (hasta 40 horas)
        if (horasTrabajadas <= 40) {
            salarioTotal = horasTrabajadas * salarioPorHora;
        } else {
            // Horas normales (40 horas)
            salarioTotal = 40 * salarioPorHora;

            // Horas extras
            int horasExtras = horasTrabajadas - 40;

            if (horasExtras <= 8) {
                // Pagar al doble las primeras 8 horas extras
                salarioTotal += horasExtras * (salarioPorHora * 2);
            } else {
                // Pagar al doble las primeras 8 horas extras
                salarioTotal += 8 * (salarioPorHora * 2);

                // Pagar al triple las horas extras restantes
                int horasExtrasRestantes = horasExtras - 8;
                salarioTotal += horasExtrasRestantes * (salarioPorHora * 3);
            }
        }

        return salarioTotal;
    }
}