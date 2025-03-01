package main;
import java.util.Scanner;
/**
 *  @description: clase principal del programa
*   @author yeison 
*/

public class Ejercicio_2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir el número de alumnos
        int numeroAlumnos = 100;

        // Crear un arreglo para almacenar las edades de los alumnos
        int[] edades = {19,20,34, 20,21,23,34,34,27,35,40,41,37,23,24,28,34,23,56,18,21,25,35,28,30,26,28,20,29,21,38,34,31,
        31,32,41,23,28,20,29,21,27,17,20,21,37,34,32,31,30,18,28,27,34,35,39,30,31,39,31,21,23,28,20,29,21,27,17,20,21,37,34,
        32,31,30,18,28,27,34,35,39,30,31,39,31,21,23,32,31,30,18,28,27,34,35,39,30,31,23,18,21,25,35,28,16};

        // Leer las edades de los alumnos
        for (int i = 0; i < numeroAlumnos; i++) {
           System.out.println("Esta es el alumno "+(i + 1)+ " y su edad es:" + edades[i]);

        }

        // Calcular la suma de las edades
        int sumaEdades = 0;
        for (int i = 0; i < numeroAlumnos; i++) {
            sumaEdades += edades[i];
        }

        // Calcular el promedio de las edades
        double promedio = (double) sumaEdades / numeroAlumnos;

        // Mostrar el promedio
        System.out.println("El promedio de edades es: " + promedio);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}