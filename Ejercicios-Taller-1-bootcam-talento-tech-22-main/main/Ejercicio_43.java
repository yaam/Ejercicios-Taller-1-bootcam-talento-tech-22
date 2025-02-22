package main;

import java.util.Scanner;

public class Ejercicio_43 { 
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
    // Crear un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario que ingrese dos números
    System.out.print("Ingrese el primer número: ");
    int numero1 = scanner.nextInt();

    System.out.print("Ingrese el segundo número: ");
    int numero2 = scanner.nextInt();

    // Realizar las operaciones según las condiciones dadas
    if (numero1 == numero2) {
        // Si los números son iguales, multiplicarlos
        int resultado = numero1 * numero2;
        System.out.println("Los números son iguales. El resultado de la multiplicación es: " + resultado);
    } else if (numero1 > numero2) {
        // Si el primer número es mayor que el segundo, restarlos
        int resultado = numero1 - numero2;
        System.out.println("El primer número es mayor. El resultado de la resta es: " + resultado);
    } else {
        // Si no se cumple ninguna de las condiciones anteriores, sumarlos
        int resultado = numero1 + numero2;
        System.out.println("El segundo número es mayor. El resultado de la suma es: " + resultado);
    }

    // Cerrar el objeto Scanner
    scanner.close();
}
}