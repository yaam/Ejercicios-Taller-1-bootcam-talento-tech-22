package main;

import java.util.Scanner;

public class Ejercicio_8 {
    /*
     * @param args Tendremos una clase main
     */
     public static void main(String[] args) {
        // creación de objeto
        Scanner scanner = new Scanner(System.in);
        // ingresar el año
        System.out.println("Ingrese el año");
        int año = scanner.nextInt();
        // hace un llamado a una función la cual se encarga de validar el año es Bisiesto
        if (esBisiesto(año)) {
            System.out.println("El año es Bisiesto");
        }else{
            System.out.println("El año no es Bisiesto");
        }
        scanner.close();
     }

     public static boolean esBisiesto(int año){
        //Un año es bisiesto si es divisible por 4 y no es divisible por 100,
        // o si es divisible por 400.
        // aquí se retorna el metodo para devolver el resultado después de evaluar la función
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
     }
    
}
