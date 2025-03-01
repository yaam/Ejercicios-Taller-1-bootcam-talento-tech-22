package main;
import java.util.Scanner;
/**
 *  @description: clase principal del programa
*   @author yeison 
*/
public class Ejercicio_6 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar contadores
        int positivos = 0;
        int negativos = 0;
        int neutros = 0;

        // Leer 20 números
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            // Determinar si el número es positivo, negativo o neutro
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                neutros++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números neutros (cero): " + neutros);

        // Cerrar el scanner
        scanner.close();
    }
}