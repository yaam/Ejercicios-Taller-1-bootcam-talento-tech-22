package main;


import java.util.Scanner;

public class Ejercicios_20 {
    /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // creación del objeto
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el día y mes de nacimiento
        System.out.print("Introduce el día de nacimiento (1-31): ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        // Determinar el signo del zodiaco
        String signo = determinarSigno(dia, mes);

        // Mostrar el resultado
        System.out.println("Tu signo del zodiaco es: " + signo);

        scanner.close();
    }

    public static String determinarSigno(int dia, int mes) {
        String signo = "";

        switch (mes) {
            case 1: // Enero
                if (dia <= 20) {
                    signo = "Capricornio";
                } else {
                    signo = "Acuario";
                }
                break;
            case 2: // Febrero
                if (dia <= 19) {
                    signo = "Acuario";
                } else {
                    signo = "Piscis";
                }
                break;
            case 3: // Marzo
                if (dia <= 20) {
                    signo = "Piscis";
                } else {
                    signo = "Aries";
                }
                break;
            case 4: // Abril
                if (dia <= 19) {
                    signo = "Aries";
                } else {
                    signo = "Tauro";
                }
                break;
            case 5: // Mayo
                if (dia <= 20) {
                    signo = "Tauro";
                } else {
                    signo = "Géminis";
                }
                break;
            case 6: // Junio
                if (dia <= 21) {
                    signo = "Géminis";
                } else {
                    signo = "Cáncer";
                }
                break;
            case 7: // Julio
                if (dia <= 21) {
                    signo = "Cáncer";
                } else {
                    signo = "Leo";
                }
                break;
            case 8: // Agosto
                if (dia <= 21) {
                    signo = "Leo";
                } else {
                    signo = "Virgo";
                }
                break;
            case 9: // Septiembre
                if (dia <= 22) {
                    signo = "Virgo";
                } else {
                    signo = "Libra";
                }
                break;
            case 10: // Octubre
                if (dia <= 22) {
                    signo = "Libra";
                } else {
                    signo = "Escorpio";
                }
                break;
            case 11: // Noviembre
                if (dia <= 21) {
                    signo = "Escorpio";
                } else {
                    signo = "Sagitario";
                }
                break;
            case 12: // Diciembre
                if (dia <= 21) {
                    signo = "Sagitario";
                } else {
                    signo = "Capricornio";
                }
                break;
            default:
                signo = "Fecha no válida";
                break;
        }

        return signo;
    }
}

