package main;

import java.util.Scanner;

public class Ejercicio_36 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad de la persona
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        // Solicitar el sexo de la persona
        System.out.print("Ingrese el sexo de la persona (M para masculino, F para femenino): ");
        char sexo = scanner.next().charAt(0);

        // Calcular el número de pulsaciones
        int pulsaciones;
        if (sexo == 'F' || sexo == 'f') {
            pulsaciones = (220 - edad) / 10;
        } else if (sexo == 'M' || sexo == 'm') {
            pulsaciones = (210 - edad) / 10;
        } else {
            System.out.println("Sexo no válido. Por favor, ingrese 'M' para masculino o 'F' para femenino.");
            
            return;
        }

        // Mostrar el resultado
        System.out.println("El número de pulsaciones por cada 10 segundos de ejercicio aeróbico es: " + pulsaciones);

        scanner.close();
    }
}
