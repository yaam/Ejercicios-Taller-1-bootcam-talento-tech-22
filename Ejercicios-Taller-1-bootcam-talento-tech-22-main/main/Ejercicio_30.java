package main;

import java.util.Scanner;

public class Ejercicio_30 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes de calorías por minuto
        final double CALORIAS_DORMIR = 1.08; // calorías por minuto
        final double CALORIAS_SENTADO = 1.66; // calorías por minuto

        // Peso de la persona
        double peso = 70.0; // en kg

        // Solicitar al usuario que elija una actividad
        System.out.println("Seleccione la actividad:");
        System.out.println("1. Dormir");
        System.out.println("2. Estar sentado en reposo");
        int opcion = scanner.nextInt();

        // Solicitar al usuario la duración de la actividad en minutos
        System.out.println("Ingrese la duración de la actividad en minutos:");
        int minutos = scanner.nextInt();

        // Calcular las calorías consumidas
        double caloriasConsumidas = 0.0;
        if (opcion == 1) {
            caloriasConsumidas = CALORIAS_DORMIR * minutos;
        } else if (opcion == 2) {
            caloriasConsumidas = CALORIAS_SENTADO * minutos;
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        // Mostrar el resultado
        System.out.printf("Las calorías consumidas durante %d minutos de la actividad seleccionada son: %.2f calorías.\n", minutos, caloriasConsumidas);

        scanner.close();
    }
}