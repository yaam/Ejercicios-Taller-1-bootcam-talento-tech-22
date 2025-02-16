package main;

//importar las clases necesarias   

/**
 *  @description: clase principal del programa
*   @author yeison 
*/
import java.util.Scanner;

//Scanner scanner = new Scanner(System.in)
//sy


public class Ejercicio_1 {
        
    /*
     * @param args Tendremos una clase vaia
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = scanner.nextInt();
        scanner.nextLine();
      
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
               } else {
                if (numero % 2 >= 0) {
                    System.out.println("El numero " + numero + " es impar ");
                    
                }
               }




    }
}
