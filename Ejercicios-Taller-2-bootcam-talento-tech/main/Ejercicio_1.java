package main;
//importar las clases necesarias   

/**
 *  @description: clase principal del programa
*   @author yeison 
*/
import java.util.Scanner;

public class Ejercicio_1 {
  /*
   * @param args Tendremos una clase main
   */

  public static void main(String[] args) {
    // Creación del objeto para almacenar los datos ingresados por el usuario
    Scanner scanner = new Scanner(System.in);
    // Declaración de vector desde A-Z
    String[] abecedario = { "A", "B", "C", "D", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R",
        "S", "T", "U", "V", "W", "X", "Y", "Z" };
    // declaración del tamaño del vector
    for (int i = 0; i < abecedario.length; i++) {
      System.out.println("Estoy en el indice: " + i);
      System.out.println("la letra del abecedario es: " + abecedario[i]);
      System.out.println("----------------------------");
    }
    System.out.println("Desea cambiar el abecedario en minuscula (oprima 1. si y 2. no)");
    int respuesta = scanner.nextInt();

    if (respuesta == 1) {
      for (int i = 0; i < abecedario.length; i++) {
        abecedario[i] = abecedario[i].toLowerCase();
        System.out.println("La letra del abecedario en minuscula: " + abecedario[i]);
        System.out.println("---------------------------------------");
      }
    } else {
      System.out.println("No se va realizar modificaciones");
      scanner.nextLine();
      for (int i = 0; i < abecedario.length; i++) {
        System.out.println("El abecedario se encuentra en mayuscula: " + abecedario[i]);
        System.out.println("------------------------------------------");
      }
    }
    scanner.close();
  }

}