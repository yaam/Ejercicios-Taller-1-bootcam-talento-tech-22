package main;

import java.util.Scanner;

public class Ejercicio_29 {
    /*
     * @param args Tendremos una clase main
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir el número de días a medir
        int numDias = 5;
        int[] puntosIMECA = new int[numDias];
        
        // Solicitar los puntos IMECA para cada día
        for (int i = 0; i < numDias; i++) {
            System.out.print("Ingrese los puntos IMECA para el día " + (i + 1) + ": ");
            puntosIMECA[i] = scanner.nextInt();
        }
        
        // Calcular el promedio de los puntos IMECA
        int suma = 0;
        for (int puntos : puntosIMECA) {
            suma += puntos;
        }
        double promedio = (double) suma / numDias;
        
        // Determinar si hay sanción y calcular la pérdida
        double gananciasDiarias = 1000.0; // Supongamos que las ganancias diarias son $1000
        double multa = 0.0;
        String mensaje = "";
        
        if (promedio > 170) {
            multa = 0.5 * gananciasDiarias * numDias; // Multa del 50% de las ganancias diarias por 5 días
            mensaje = "La fábrica será sancionada. Pérdida total: $" + multa;
        } else {
            mensaje = "La fábrica no será sancionada. No hay pérdida.";
        }
        
        // Mostrar el resultado
        System.out.println("El promedio de puntos IMECA es: " + promedio);
        System.out.println(mensaje);
        
        scanner.close();
    }
}
