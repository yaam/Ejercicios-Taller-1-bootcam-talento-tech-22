package main;
import java.util.Scanner;

public class Ejercicio_38 {

    private static final double COSTO_POR_MATERIA = 100.0; // Costo por materia en dólares
    /*
     * @param args Tendremos una clase main
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Código para calcular la matrícula
        System.out.print("Ingrese el número de materias que está cursando: ");
        int numeroMaterias = scanner.nextInt();

        // Calcular el costo total de la matrícula
        double costoTotal = numeroMaterias * COSTO_POR_MATERIA;

        System.out.println("El costo total de la matrícula es: $" + costoTotal);

        scanner.close();
    }
    
}
