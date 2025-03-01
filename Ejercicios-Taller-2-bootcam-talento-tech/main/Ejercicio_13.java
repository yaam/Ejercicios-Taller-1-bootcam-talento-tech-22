package main;
import java.util.Scanner;
/**
 * @description: clase principal del programa
 * @author yeison
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        //creación del objeto
        Scanner input = new Scanner(System.in);
        //variables
        int totalAutos = 25;
        double sumaPuntos = 0;
         //variables de maximo y minimo
        double maxContaminacion = Double.MIN_VALUE;
        double minContaminacion = Double.MAX_VALUE;

        System.out.println("Ingrese los puntos contaminantes de los 25 autos:");
        // se realiza el recorrido
        for (int i = 0; i < totalAutos; i++) {
            System.out.print("Auto " + (i + 1) + ": ");
            double puntos = input.nextDouble();

            sumaPuntos += puntos;

            if (puntos > maxContaminacion) {
                maxContaminacion = puntos;
            }

            if (puntos < minContaminacion) {
                minContaminacion = puntos;
            }
        }

        double promedio = sumaPuntos / totalAutos;

        System.out.println("\nResultados:");
        System.out.println("Promedio de puntos contaminantes: " + promedio);
        System.out.println("Máxima contaminación: " + maxContaminacion);
        System.out.println("Mínima contaminación: " + minContaminacion);

        input.close();
    }
}