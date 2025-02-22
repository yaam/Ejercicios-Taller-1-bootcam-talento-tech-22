package main;

import java.util.Scanner;

public class Ejercicio_37 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el monto de la fianza
        System.out.print("Ingrese el monto de la fianza: ");
        double montoFianza = scanner.nextDouble();

        // Calcular la cuota según el monto de la fianza
        double cuota;
        if (montoFianza < 50000) {
            cuota = montoFianza * 0.03; // 3% del monto
        } else {
            cuota = montoFianza * 0.02; // 2% del monto
        }

        // Mostrar la cuota a pagar
        System.out.println("La cuota a pagar es: Bs. " + cuota);

        // Cerrar el scanner
        scanner.close();
    }
}
