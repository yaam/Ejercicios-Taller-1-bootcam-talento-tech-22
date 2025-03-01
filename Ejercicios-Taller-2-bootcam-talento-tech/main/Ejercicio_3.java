
package main;
import java.util.Scanner;
/**
 *  @description: clase principal del programa
*   @author yeison 
*/

public class Ejercicio_3 {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declarar un arreglo para almacenar las 7 calificaciones
        double[] calificaciones = new double[7];

        // Solicitar al usuario que ingrese las 7 calificaciones
        System.out.println("Ingrese las 7 calificaciones del alumno en Cálculo:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        // Calcular la suma de las calificaciones
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }

        // Calcular el promedio
        double promedio = suma / 7;

        // Mostrar el resultado
        System.out.println("El promedio del alumno en Cálculo es: " + promedio);

        // Cerrar el Scanner
        scanner.close();
    }
}
