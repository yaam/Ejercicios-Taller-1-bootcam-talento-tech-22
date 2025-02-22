package main;

import java.util.Scanner;

public class Ejercicio_10 {
    /*
     * @param args Tendremos una clase main
     */

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número de mes
        System.out.print("Ingrese el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();

        // Mostrar el nombre del mes correspondiente
        String nombreMes;
        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Número de mes inválido";
                break;
        }

        // Mostrar el resultado
        System.out.println("El mes correspondiente es: " + nombreMes);

        // Cerrar el scanner
        scanner.close();
    }
}