package guia3.e1;

import guia3.e1.clases.Autobus;
import guia3.e1.clases.Bicicleta;
import guia3.e1.clases.Tranvia;

import java.util.Scanner;

public class E1 {
    public static void ejecutar(Scanner input) {

        Autobus colectivo = new Autobus(562, 20);
        Tranvia tren = new Tranvia("A", 40);
        Bicicleta bici = new Bicicleta("AX66");

        System.out.println("Arrancar vehiculos: \n");
        colectivo.arrancar();
        tren.arrancar();
        bici.arrancar();
        System.out.println("\n--------------------------------\n");

        System.out.println("Estado de los vehiculos: \n");
        colectivo.obtenerEstado();
        tren.obtenerEstado();
        bici.obtenerEstado();
        System.out.println("\n--------------------------------\n");

        System.out.println("Modificaciones");
        colectivo.proximaParada("2");
        tren.cambiarVia("2");
        bici.ajustarAsiento(5);
        System.out.println("\n--------------------------------\n");

        System.out.println("Capacidades de los vehiculos: \n");
        System.out.println("Capacidad del colectivo: " + colectivo.obtenerCapacidad());
        System.out.println("Capacidad del tren: " + tren.obtenerCapacidad());
        System.out.println("Capacidad de la bicicleta: " + bici.obtenerCapacidad());
        System.out.println("\n--------------------------------");

        System.out.println("Estado de los vehiculos: \n");
        colectivo.obtenerEstado();
        tren.obtenerEstado();
        bici.obtenerEstado();
        System.out.println("\n--------------------------------\n");

        System.out.println("Detener vehiculos: ");
        colectivo.detener();
        tren.detener();
        bici.detener();
        System.out.println("\n--------------------------------\n");

        System.out.println("Estado de los vehiculos: \n");
        colectivo.obtenerEstado();
        tren.obtenerEstado();
        bici.obtenerEstado();
        System.out.println("\n--------------------------------\n");

    }
}
