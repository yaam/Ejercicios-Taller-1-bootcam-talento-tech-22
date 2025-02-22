package main;

import java.util.Scanner;

public class Ejercicio_40 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el costo de la casa
        System.out.print("Ingrese el costo de la casa: ");
        double costoCasa = scanner.nextDouble();

        // Solicitar los ingresos del comprador
        System.out.print("Ingrese los ingresos del comprador: ");
        double ingresos = scanner.nextDouble();

        double enganche;
        int años;
        double pagoMensual;

        // Determinar el enganche y el plazo según los ingresos
        if (ingresos > 8000) {
            enganche = costoCasa * 0.15;
            años = 10;
        } else {
            enganche = costoCasa * 0.30;
            años = 7;
        }

        // Calcular el monto restante después del enganche
        double montoRestante = costoCasa - enganche;

        // Calcular el número de meses
        int meses = años * 12;

        // Calcular el pago mensual
        pagoMensual = montoRestante / meses;

        // Mostrar los resultados
        System.out.println("Enganche: Bs. " + enganche);
        System.out.println("Pago mensual: Bs. " + pagoMensual);
        System.out.println("Plazo: " + años + " años");

        scanner.close();
    }
}
