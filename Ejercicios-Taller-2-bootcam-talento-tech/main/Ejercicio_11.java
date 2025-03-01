package main;

import java.util.Scanner;

/**
 * @description: clase principal del programa
 * @author yeison
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables para almacenar sumas y conteos
        double sumaNinos = 0, sumaJovenes = 0, sumaAdultos = 0, sumaViejos = 0;
        int contadorNinos = 0, contadorJovenes = 0, contadorAdultos = 0, contadorViejos = 0;
        
        System.out.println("Encuesta de pesos - Ingrese datos para 50 personas:");

        for (int i = 1; i <= 50; i++) {
            System.out.println("\nPersona #" + i);
            
            // Validación de edad
            int edad;
            do {
                System.out.print("Edad (0-100): ");
                edad = scanner.nextInt();
            } while (edad < 0 || edad > 100);
            
            // Validación de peso
            double peso;
            do {
                System.out.print("Peso (kg): ");
                peso = scanner.nextDouble();
            } while (peso <= 0);

            // Clasificación en categorías
            if (edad <= 13) {
                sumaNinos += peso;
                contadorNinos++;
            } else if (edad <= 29) {
                sumaJovenes += peso;
                contadorJovenes++;
            } else if (edad <= 59) {
                sumaAdultos += peso;
                contadorAdultos++;
            } else {
                sumaViejos += peso;
                contadorViejos++;
            }
        }

        // Cálculo de promedios
        double promedioNinos = contadorNinos > 0 ? sumaNinos / contadorNinos : 0;
        double promedioJovenes = contadorJovenes > 0 ? sumaJovenes / contadorJovenes : 0;
        double promedioAdultos = contadorAdultos > 0 ? sumaAdultos / contadorAdultos : 0;
        double promedioViejos = contadorViejos > 0 ? sumaViejos / contadorViejos : 0;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.printf("Niños (0-13 años): %d personas - Promedio: %.2f kg\n", 
                        contadorNinos, promedioNinos);
        System.out.printf("Jóvenes (14-29 años): %d personas - Promedio: %.2f kg\n", 
                        contadorJovenes, promedioJovenes);
        System.out.printf("Adultos (30-59 años): %d personas - Promedio: %.2f kg\n", 
                        contadorAdultos, promedioAdultos);
        System.out.printf("Viejos (60+ años): %d personas - Promedio: %.2f kg\n", 
                        contadorViejos, promedioViejos);

        scanner.close();
    }
}