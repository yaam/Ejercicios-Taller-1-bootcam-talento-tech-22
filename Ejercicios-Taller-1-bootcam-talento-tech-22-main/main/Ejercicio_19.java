package main;

import java.util.Scanner;

public class Ejercicio_19 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // creación del objeto
        Scanner scanner = new Scanner(System.in);
        // Solicitar el tipo de vehículo
        System.out.println("Ingrese el tipo de vehículo (A para automóvil, C para camión):");
        char tipoVehiculo = scanner.next().charAt(0);
        tipoVehiculo= Character.toUpperCase(tipoVehiculo);

        // Solicitar el tipo de hora
        System.out
                .println("Ingrese el tipo de hora (1 para hora de alta congestión, 2 para hora menos congestionada):");
        int tipoHora = scanner.nextInt();

        // Solicitar el número de pasajeros
        System.out.println("Ingrese el número de pasajeros:");
        int numPasajeros = scanner.nextInt();

        // Calcular la tarifa
        int tarifa = 0;
        if (tipoVehiculo == 'A') { // Automóvil
            if (tipoHora == 1) { // Hora de alta congestión
                if (numPasajeros >= 3) {
                    tarifa = 0; // No paga peaje
                } else {
                    tarifa = 50; // Paga 50 euros
                }
            } else if (tipoHora == 2) { // Hora menos congestionada
                tarifa = 25; // Paga 25 euros
            }
        } else if (tipoVehiculo == 'C') { // Camión
            if (tipoHora == 1) { // Hora de alta congestión
                tarifa = 50; // Paga 50 euros
            } else if (tipoHora == 2) { // Hora menos congestionada
                tarifa = 30; // Paga 30 euros
            }
        }

        // Mostrar la tarifa
        System.out.println("La tarifa a cobrar es: " + tarifa + " euros.");

        scanner.close();
    }
}