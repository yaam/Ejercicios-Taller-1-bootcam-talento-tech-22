package main;

import java.util.Scanner;

public class Ejercicio_24 {
    /*
     * @param args Tendremos una clase main
     */

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las horas trabajadas
        System.out.print("Ingrese las horas trabajadas esta semana: ");
        int horasTrabajadas = scanner.nextInt();

        // Definir las tarifas de pago
        int tarifaNormal = 16;
        int tarifaExtra = 20;
        int horasNormales = 40;

        // Calcular el salario semanal
        int salario;
        if (horasTrabajadas <= horasNormales) {
            salario = horasTrabajadas * tarifaNormal;
        } else {
            int horasExtras = horasTrabajadas - horasNormales;
            salario = (horasNormales * tarifaNormal) + (horasExtras * tarifaExtra);
        }

        // Mostrar el salario semanal
        System.out.println("El salario semanal es: Bs. " + salario);

        // Cerrar el scanner
        scanner.close();
    }
}
