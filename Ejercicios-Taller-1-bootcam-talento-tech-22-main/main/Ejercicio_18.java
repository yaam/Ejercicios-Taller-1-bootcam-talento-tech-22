package main;

import java.util.Scanner;

public class Ejercicio_18 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // creación del objeto
        Scanner scanner = new Scanner(System.in);

        // solicitaar ingresar el tipo de vehiculo
        System.out.println("Introduce el tipo de vehículo (C: Camión, A: Autobús, T: Turismo, M: Motocicleta):");

        char tipoVehiculo = scanner.next().charAt(0);
        // solicitar ingresar el nivel de alcohol que tiene en la sangre el conductor

        System.out.println("Ingrese la tasa de alcohol que hay en la sangre del conductor (en mg/1): ");

        double tasaAlcohol = scanner.nextDouble();

        // determinar la tasa maxima permitida segun el tipo de vehiculo
        double tasaMaxima = 0.0;
        switch (tipoVehiculo) {
            case 'C':
            case 'c':
                tasaMaxima = 0.3;
                break;
            case 'A':
            case 'a':
                tasaMaxima = 0.3;
                break;
            case 'T':
            case 't':
                tasaMaxima = 0.5;
                break;
            case 'M':
            case 'm':
                tasaMaxima = 0.3;
                break;
            default:
                System.out.println("Tipo de vehiculo no permitido");
                return;
        }

        // determinar si es positivo en el control de alcholemia
        if (tasaAlcohol > tasaMaxima) {
            System.out.println("Positivo en el control de alcholemia. Tasa de alchol supera el límite permitico. ");

        } else {
            System.out.println("Negativo en el control de alcholemia. Tasa de alcho dentro del límite permitido");
        }
        scanner.close();

    }

}
