package main;


import java.util.Scanner;

public class Ejercicio_4 {
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
          System.out.println("Introduce el número_2");
          int numero_2 = scanner.nextInt();
          scanner.nextLine();

          //Se realiza la comprobación de números
          if (numero > numero_2) {
            System.out.println("El numero " + numero + " mayor que " + numero_2);
            scanner.nextLine();

            }else if (numero < numero_2) {
                System.out.println("El numero " + numero + " menor que " + numero_2);
                scanner.nextLine();
                
            }else{
                System.out.println("EL número " + numero + " es igual al número " + numero_2);
                scanner.nextLine();

            }
            scanner.close();
    }
}
