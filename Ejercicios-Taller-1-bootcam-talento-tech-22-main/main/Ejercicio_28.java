package main;

public class Ejercicio_28 {
     /*
     * @param args Tendremos una clase main
     */
    public static void main(String[] args) {
        // Supongamos que el bosque tiene N hectáreas
        int N = 150; // Ejemplo: 150 hectáreas
        double superficieTotal = N * 10000; // Convertir a metros cuadrados

        double porcentajeAraguaney, porcentajeSaman, porcentajeCeiba;

        if (superficieTotal > 1000000) {
            porcentajeAraguaney = 70;
            porcentajeSaman = 20;
            porcentajeCeiba = 10;
        } else {
            porcentajeAraguaney = 50;
            porcentajeSaman = 30;
            porcentajeCeiba = 20;
        }

        double superficieAraguaney = superficieTotal * (porcentajeAraguaney / 100);
        double superficieSaman = superficieTotal * (porcentajeSaman / 100);
        double superficieCeiba = superficieTotal * (porcentajeCeiba / 100);

        int numAraguaneyes = (int) ((superficieAraguaney / 10) * 8);
        int numSamanes = (int) ((superficieSaman / 15) * 15);
        int numCeibas = (int) ((superficieCeiba / 18) * 10);

        System.out.println("Número de Araguaneyes: " + numAraguaneyes);
        System.out.println("Número de Samanes: " + numSamanes);
        System.out.println("Número de Ceibas: " + numCeibas);
    }
}
