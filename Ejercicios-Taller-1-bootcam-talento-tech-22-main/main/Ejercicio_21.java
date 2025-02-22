package main;

import java.util.Scanner;

public class Ejercicio_21 {
    /*
     * @param args Tendremos una clase main
     */

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar las tres calificaciones
        System.out.print("Ingresa la primera calificación: ");
        double calificacion1 = scanner.nextDouble();

        System.out.print("Ingresa la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();

        System.out.print("Ingresa la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        // Determinar si el alumno aprueba o reprueba
        if (promedio >= 70) {
            System.out.println("El alumno aprueba con un promedio de: " + promedio);
        } else {
            System.out.println("El alumno reprueba con un promedio de: " + promedio);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
