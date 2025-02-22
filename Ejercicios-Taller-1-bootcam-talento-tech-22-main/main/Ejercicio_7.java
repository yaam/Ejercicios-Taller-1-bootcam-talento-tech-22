package main;

import java.util.Scanner;

public class Ejercicio_7 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // Creación del objeto
        Scanner scanner = new Scanner(System.in);
        // pedir al usuario que ingrese los grados Celcius
        System.out.println("Introduce la temperatura del agua en grados celcius ");
        Double temperatura = scanner.nextDouble();
        // Determinar el estado del agua
        String estado;
        if (temperatura <= 0) {
            estado = "Sólido";
        } else if (temperatura < 100) {
            estado = "liquido";
        } else {
            estado = "gas";
        }
        // usar switch para mostrar el estado del agua
        switch (estado) {
            case "Sólido":
                System.out.println("El agua en estado sólido (Hielo)");
                break;
            case "liquido":
                System.out.println("El agua esta en estado liquido");
                break;
            case "gas":
                System.out.println("El agua en estado gaseoso (Vapor)");
                break;
            default:
                System.out.println("Estado desconocido");
                break;
        }
        scanner.close();
    }

}
