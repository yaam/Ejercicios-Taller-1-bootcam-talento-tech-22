package main;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio_6 {
   /*
    * @param args Tendremos una clase main
    */
   public static void main(String[] args) {
      // Creación del objeto
      Scanner scanner = new Scanner(System.in);
      // declaración de vector
      int vector[] = new int[4];
      // solicitamos que ingrese el número y llenamos el vector
      for (int i = 0; i < vector.length; i++) {
         System.out.println("introduce un numero " + i);
            System.out.println("Número " + (i + 1) + ":");       
               vector[i] = scanner.nextInt();
               }
               // Ordenar el vector de números
               Arrays.sort(vector);
               // Mostrar los número mayor es en orden
               System.out.println("Los números mayores en orden son: ");
                  for (int i = vector.length -1; i>= 0; i--){
                     System.out.println(vector[i]);
                  }
                  scanner.close();
            }
      }
   


