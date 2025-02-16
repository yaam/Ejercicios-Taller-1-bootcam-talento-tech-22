package main;

import java.util.Scanner;

public class Ejercicio_5 {
       /*
     * @param args Tendremos una clase vaia
     */
    public static void main(String[] args) {
        //Creación del objeto 
          Scanner scanner = new Scanner(System.in);
          // solicitamos que ingrese el número
           // declaración de variable
          System.out.println("Introduce un número");
           int numero = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Introduce el segundo número");
          int numero_2 = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Introduce el tercer número");
          int numero_3 = scanner.nextInt();
          scanner.nextLine();
          //Se realiza la comprobación de números
          if (numero > numero_2) {
            System.out.println("El numero " + numero + " mayor que " + numero_2);
            scanner.nextLine();

            }else if (numero < numero_2) {
                System.out.println("El numero " + numero + " menor que " + numero_2);
                scanner.nextLine();
                
            }else if (numero > numero_3) {
                System.out.println("El numero " + numero + " mayor que " + numero_3);
                scanner.nextLine();
            }else if (numero < numero_3) {
                System.out.println("El numero " + numero + " menor que " + numero_3);
                scanner.nextLine();
                
            }else if (numero_2 > numero) {
                System.out.println("El numero dos " + numero_2 + " mayor que " + numero);
                scanner.nextLine();
                
            }else if (numero_2 < numero) {
                System.out.println("El numero dos " + numero_2 + " menor que " + numero);
                scanner.nextLine();
            }{
                System.out.println("EL número " + numero + " es igual al número " + numero_2 + "también es igual " +numero_3);
                scanner.nextLine();

            }
            scanner.close();
    }
}
