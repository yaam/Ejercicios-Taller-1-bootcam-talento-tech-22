package main;

import java.util.Scanner;

public class Ejercicio_17 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el código identificador
        System.out.print("Ingrese el código identificador de 3 cifras: ");
        int codigo = scanner.nextInt();

        // Verificar las condiciones para determinar la categoría del empleado
        if (codigo % 2 == 0 && codigo % 3 == 0 && codigo % 5 == 0) {
            System.out.println("Director general");
        } else if (codigo % 3 == 0 && codigo % 5 == 0 && codigo % 2 != 0) {
            System.out.println("Directivo");
        } else if (codigo % 2 == 0 && codigo % 3 != 0 && codigo % 5 != 0) {
            System.out.println("Staff");
        } else if (codigo % 2 != 0 && codigo % 3 != 0 && codigo % 5 != 0) {
            System.out.println("Seguridad");
        } else {
            System.out.println("Código no clasificado");
        }

        scanner.close();
    }
}