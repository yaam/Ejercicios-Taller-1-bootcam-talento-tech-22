package main;

import java.util.Scanner;

public class Ejercicio_13 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la duración de la llamada en minutos
        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int minutos = scanner.nextInt();

        // Definir el costo base y el costo por minuto adicional
        int costoBase = 10; // Costo para llamadas de 5 minutos o menos
        int costoAdicionalPorMinuto = 2; // Costo por cada minuto adicional después de los 5 primeros

        // Calcular el costo total de la llamada
        int costoTotal;
        if (minutos <= 5) {
            costoTotal = costoBase;
        } else {
            int minutosAdicionales = minutos - 5;
            costoTotal = costoBase + (minutosAdicionales * costoAdicionalPorMinuto);
        }

        // Mostrar el costo total de la llamada
        System.out.println("El costo total de la llamada es: " + costoTotal + " BsF");

        // Cerrar el Scanner
        scanner.close();
    }
}