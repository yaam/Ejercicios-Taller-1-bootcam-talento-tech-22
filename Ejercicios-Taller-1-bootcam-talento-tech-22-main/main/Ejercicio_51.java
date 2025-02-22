package main;

import java.util.Scanner;

public class Ejercicio_51 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;

        try {
            // Pregunta 1: ¿Colon descubrió América?
            System.out.println("Pregunta 1: ¿Colón descubrió América? (Sí/No)");
            String respuesta1 = scanner.nextLine().trim().toLowerCase();

            if (respuesta1.equals("sí") || respuesta1.equals("si")) {
                respuestasCorrectas++;
                System.out.println("¡Correcto!");

                // Pregunta 2: ¿La independencia de Venezuela fue en el año 1810?
                System.out.println("Pregunta 2: ¿La independencia de Venezuela fue en el año 1810? (Sí/No)");
                String respuesta2 = scanner.nextLine().trim().toLowerCase();

                if (respuesta2.equals("sí") || respuesta2.equals("si")) {
                    respuestasCorrectas++;
                    System.out.println("¡Correcto!");

                    // Pregunta 3: ¿Soda Stereo fue un grupo de rock Mexicano?
                    System.out.println("Pregunta 3: ¿Soda Stereo fue un grupo de rock Mexicano? (Sí/No)");
                    String respuesta3 = scanner.nextLine().trim().toLowerCase();

                    if (respuesta3.equals("no")) {
                        respuestasCorrectas++;
                        System.out.println("¡Correcto!");
                    } else {
                        System.out.println("Incorrecto. Soda Stereo fue un grupo de rock Argentino.");
                    }
                } else {
                    System.out.println("Incorrecto. La independencia de Venezuela fue en 1810.");
                }
            } else {
                System.out.println("Incorrecto. Colón descubrió América en 1492.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }

        // Verificar si el jugador ganó
        if (respuestasCorrectas == 3) {
            System.out.println("¡Felicidades! Has respondido todas las preguntas correctamente.");
        } else {
            System.out.println("Juego terminado. Respuestas correctas: " + respuestasCorrectas);
        }
    }
}