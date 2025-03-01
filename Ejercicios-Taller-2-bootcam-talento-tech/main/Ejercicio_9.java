package main;

import java.util.Scanner;

/**
 * @description: clase principal del programa
 * @author yeison
 */
public class Ejercicio_9 {

    // Función para calcular la calificación media
    public static double calcularMedia(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Función para encontrar la calificación más baja
    public static double encontrarMinima(double[] calificaciones) {
        double minima = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < minima) {
                minima = calificacion;
            }
        }
        return minima;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // las calificaciones de los 40 alumnos
        double[] calificaciones = {5,4,3.4, 2.5,2.1,2.3,3.4,3.4,2.7,3.5,4,4.1,3.7,2.3,2.4,2.8,3.4,2.3,5.6,1.8,2.1,2.5,3.5,2.8,3.7,2.6,2.8,3,3,2.1,3.8,3.4,3.1,
            3.1,3.2,4.1,2.3,2.8,4.8,4.9};
       
        //Muestra en pantalla las 40 calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Calificación de los alumno " + (i + 1) + ": " + calificaciones[i] + "\n");
            
        }

        // Calcular la calificación media
        double media = calcularMedia(calificaciones);
        System.out.println("La calificación media es: " + media);

        // Encontrar la calificación más baja
        double minima = encontrarMinima(calificaciones);
        System.out.println("La calificación más baja es: " + minima);

        scanner.close();
    }
}  
