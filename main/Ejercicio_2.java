package main;

import java.util.Scanner;

public class Ejercicio_2 {
   /*
    * @param args Tendremos una clase vaia
    */
   public static void main(String[] args) {
      // TODO code application logic here
      // Variable
      // se realiza creación del objeto
      Scanner scanner = new Scanner(System.in);
      // solicitamos que ingrese el número
      System.out.println("Introduce un número");
      int numero = scanner.nextInt();
      scanner.nextLine();

      if (numero > 0) {
         System.out.println("El número " + numero + " es positivo");

      } else if (numero < 0) {
         System.out.println("El número " + numero + " es negativo");

      } else {
         System.out.println("El número " + numero + " es 0");

      }
      scanner.close();
   }

}