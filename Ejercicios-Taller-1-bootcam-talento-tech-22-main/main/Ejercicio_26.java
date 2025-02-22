package main;

import java.util.Scanner;

public class Ejercicio_26 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Metros a Pies");
        System.out.println("2. Pies a Metros");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la cantidad en metros: ");
            double metros = scanner.nextDouble();
            double pies = metros * 3.28084;
            System.out.println(metros + " metros son " + pies + " pies.");
        } else if (opcion == 2) {
            System.out.print("Ingrese la cantidad en pies: ");
            double pies = scanner.nextDouble();
            double metros = pies / 3.28084;
            System.out.println(pies + " pies son " + metros + " metros.");
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
