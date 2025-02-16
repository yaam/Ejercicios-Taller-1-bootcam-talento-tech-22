package main;

import java.util.Scanner;

public class Ejercicio_3 {
    /*
     * @param args Tendremos una clase vaia
     */
    public static void main(String[] args) {
        //Creación del objeto 
        Scanner scanner = new Scanner(System.in);
        // solicitamos que ingrese el número
        System.out.println("Introduce un número");
        int numero = scanner.nextInt();
        scanner.nextLine();
      
        if (numero > 0) {
            // solicitamos que ingrese el segundo número
            System.out.println("Introduce segundo numero");
            /* realizamos operacionmes de suma resta y multiplicacion de los numeros
             ingresados
             */ 
            int numero_2 = scanner.nextInt();
            int suma = numero + numero_2;
            int resta = numero - numero_2;
            int producto = numero * numero_2;
            System.out.println("la suma de los dos números es " + suma);
            System.out.println("la resta de los dos números es " + resta);
            System.out.println("el producto  de los dos números es " + producto);

        } 
        // se le informa al usuario que el número es negativo
        else if (numero < 0) {
            System.out.println("El número es negativo no se puede realizar operaciones");
        }
        scanner.close();
    }

}
