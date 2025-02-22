package main;

import java.util.Scanner;

public class Ejercicio_11 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la inicial del día de la semana (L, M, X, J, V, S, D): ");
        char inicial = scanner.next().charAt(0);

        // Convertir a mayúscula para manejar minúsculas también
        inicial = Character.toUpperCase(inicial);

        String diaCompleto;

        switch (inicial) {
            case 'L':
                diaCompleto = "Lunes";
                break;
            case 'M':
                diaCompleto = "Martes";
                break;
            case 'X':
                diaCompleto = "Miércoles";
                break;
            case 'J':
                diaCompleto = "Jueves";
                break;
            case 'V':
                diaCompleto = "Viernes";
                break;
            case 'S':
                diaCompleto = "Sábado";
                break;
            case 'D':
                diaCompleto = "Domingo";
                break;
            default:
                diaCompleto = "Inicial no válida";
                break;
        }

        System.out.println("El día correspondiente es: " + diaCompleto);

        scanner.close();
    }
}