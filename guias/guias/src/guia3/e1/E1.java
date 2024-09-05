package guia3.e1;

import java.util.Scanner;

public class E1 {
    public static void ejecutar(Scanner input) {

        Autobus colectivo = new Autobus(562, 20);
        Tranvia tren = new Tranvia("A", 40);
        Bicicleta bici = new Bicicleta("AX66");

        colectivo.arrancar();
        tren.arrancar();
        bici.arrancar();

        System.out.println("Capacidad del colectivo: " + colectivo.obtenerCapacidad());
        System.out.println("Capacidad del tren: " + tren.obtenerCapacidad());
        System.out.println("Capacidad de la bicicleta: " + bici.obtenerCapacidad());

        colectivo.detener();
        tren.detener();
        bici.detener();


    }
}
