package main;

import java.util.Scanner;

public class Ejercicio_50 {
    /*
     * @param args Tendremos una clase main
     */

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de cauchos que desea comprar
        System.out.print("Ingrese la cantidad de cauchos que desea comprar: ");
        int cantidadCauchos = scanner.nextInt();

        // Definir los precios según la cantidad de cauchos
        int precioPorUnidad;
        if (cantidadCauchos < 5) {
            precioPorUnidad = 300;
        } else if (cantidadCauchos >= 5 && cantidadCauchos <= 10) {
            precioPorUnidad = 250;
        } else {
            precioPorUnidad = 200;
        }

        // Calcular el total a pagar
        int totalPagar = cantidadCauchos * precioPorUnidad;

        // Mostrar los resultados
        System.out.println("Precio por unidad: Bs. " + precioPorUnidad);
        System.out.println("Total a pagar: Bs. " + totalPagar);

        // Cerrar el scanner
        scanner.close();
    }
}