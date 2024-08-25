package guia0;

import java.util.Scanner;

public class E11 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingresar la valocidad en Km/h para paasarla a m/s: ");
        double velKm = input.nextDouble();
        input.nextLine();

        double velMS = velKm * 1000 / 3600;

        System.out.println("Velocidad en m/s = " + velMS);
    }
}
