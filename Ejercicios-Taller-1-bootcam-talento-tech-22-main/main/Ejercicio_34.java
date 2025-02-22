package main;

import java.util.Scanner;

public class Ejercicio_34 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de cauchos que desea comprar
        System.out.print("Ingrese la cantidad de cauchos que desea comprar: ");
        int cantidad = scanner.nextInt();

        // Definir el precio por caucho
        int precioPorCaucho;

        // Determinar el precio según la cantidad de cauchos
        if (cantidad < 5) {
            precioPorCaucho = 800;
        } else {
            precioPorCaucho = 700;
        }

        // Calcular el total a pagar
        int total = cantidad * precioPorCaucho;

        // Mostrar el total a pagar
        System.out.println("El total a pagar es: BsF " + total);

        // Cerrar el scanner
        scanner.close();
    }
}
