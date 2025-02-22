package main;

import java.util.Scanner;

public class Ejercicio_16 {
    /*
     * @param args Tendremos una clase main
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de horas trabajadas
        System.out.print("Introduce el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        // Solicitar el precio por hora
        System.out.print("Introduce el precio por hora: ");
        double precioHora = scanner.nextDouble();

        // Calcular el salario bruto
        double salarioBruto = calcularSalarioBruto(horasTrabajadas, precioHora);

        // Calcular los impuestos
        double impuestos = calcularImpuestos(salarioBruto);

        // Calcular el salario neto
        double salarioNeto = salarioBruto - impuestos;

        // Mostrar el resultado
        System.out.printf("El salario bruto es: %.2f€\n", salarioBruto);
        System.out.printf("Los impuestos son: %.2f€\n", impuestos);
        System.out.printf("El salario neto es: %.2f€\n", salarioNeto);

        scanner.close();
    }

    public static double calcularSalarioBruto(int horasTrabajadas, double precioHora) {
        int horasNormales = 35 * 4; // 35 horas por semana * 4 semanas
        double salarioBruto;

        if (horasTrabajadas <= horasNormales) {
            salarioBruto = horasTrabajadas * precioHora;
        } else {
            int horasExtras = horasTrabajadas - horasNormales;
            salarioBruto = (horasNormales * precioHora) + (horasExtras * precioHora * 1.5);
        }

        return salarioBruto;
    }

    public static double calcularImpuestos(double salarioBruto) {
        double impuestos;

        if (salarioBruto < 600) {
            impuestos = 0;
        } else if (salarioBruto >= 600 && salarioBruto <= 1000) {
            impuestos = salarioBruto * 0.20;
        } else {
            impuestos = salarioBruto * 0.30;
        }

        return impuestos;
    }
}
