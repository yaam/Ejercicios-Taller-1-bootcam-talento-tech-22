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
          if (numero > numero_2 && numero > numero_3) {
            System.out.println("El numero " + numero + " mayor que " + numero_2 + " y también es mayor que " + numero_3 );
            scanner.nextLine();

            }else if (numero < numero_2 && numero < numero_3) {
                System.out.println("El numero " + numero + " menor que " + numero_2 + " y también es menor que "+ numero_3);
                scanner.nextLine();
                
            }else if (numero > numero_2 && numero < numero_3) {
                System.out.println("El número " + numero + " mayor que " + numero_2 + " y también es menor que número "+ numero_3);
                scanner.nextLine();
            }else if (numero < numero_2 && numero > numero_3) {
                System.out.println("El número " + numero + " menor que " + numero_2 + " y también es mayor que número 3" + numero_3);
                scanner.nextLine();
                
            }else if (numero_2 > numero && numero_2 > numero_3) {
                System.out.println("El número  " + numero_2 + " mayor que " + numero + " y también es mayor que número "+ numero_3);
                scanner.nextLine();
            }
            else if (numero_2 < numero && numero_3 < numero_2) {
                System.out.println("El número  " + numero_2 + " menor que " + numero + " y tambien es menor que  número " + numero_3);
                scanner.nextLine();
            }else if (numero_2 > numero && numero_2 < numero_3) {
                System.out.println("El numero  " + numero_2 + " mayor que " + numero + " y tambien es menor que " + numero_3);
                scanner.nextLine();
                
            }else if (numero_2 < numero && numero_2 > numero_3) {
                System.out.println("El número " + numero_2 + " menor que " + numero + " y también es mayor que " + numero_3);
                scanner.nextLine();
                
            }else if (numero_3 > numero && numero_3 > numero_2) {
                System.out.println("El número  " + numero_3 + " mayor que " + numero + " y también es mayor que " + numero_2);
                scanner.nextLine();
            }else if (numero_3 < numero && numero_3 < numero_2) {
                System.out.println("El número  " + numero_3 + " menor que " + numero + " y también es menor que " + numero_2);
                scanner.nextLine();
            }else if (numero_3 > numero && numero_3 < numero_2) {
                System.out.println("el número " + numero_3 + " mayor que " + numero + " y también es menor que " + numero_2);
            }else if (numero_3 < numero && numero_3 > numero_2) {
                System.out.println("el número " + numero_3 + " menor que " + numero + " y también es mayor que " + numero_2);
            }{
                System.out.println("EL número " + numero + " es igual al número " + numero_2 + " y también es igual " +numero_3 );
                scanner.nextLine();

            }
            scanner.close();
    }
}
