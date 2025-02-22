package main;

import java.util.Scanner;

public class Ejercicio_41 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el monto de la hipoteca
        System.out.print("Ingrese el monto de la hipoteca (Bs.): ");
        double montoHipoteca = scanner.nextDouble();

        // Solicitar el monto total de la inversión requerida
        System.out.print("Ingrese el monto total de la inversión requerida (Bs.): ");
        double inversionTotal = scanner.nextDouble();

        double inversionPersona;
        double inversionSocio;

        if (montoHipoteca < 1000000) {
            // Si el monto de la hipoteca es menor a Bs. 1.000.000
            inversionPersona = inversionTotal * 0.5;
            inversionSocio = inversionTotal * 0.5;
        } else {
            // Si el monto de la hipoteca es Bs. 1.000.000 o más
            inversionPersona = montoHipoteca;
            double resto = inversionTotal - montoHipoteca;
            inversionPersona += resto / 2;
            inversionSocio = resto / 2;
        }

        // Mostrar los resultados
        System.out.println("Inversión de la persona: Bs. " + inversionPersona);
        System.out.println("Inversión del socio: Bs. " + inversionSocio);

        scanner.close();
    }
}