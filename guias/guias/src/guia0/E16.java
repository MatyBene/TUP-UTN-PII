package guia0;

import java.util.Scanner;

public class E16 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingresar la hora: ");
        int h = input.nextInt();
        input.nextLine();
        System.out.println("Ingresar los minutos: ");
        int m = input.nextInt();
        input.nextLine();
        System.out.println("Ingresar los segundos: ");
        int s = input.nextInt();
        input.nextLine();

        if(h < 0 || h > 23) {
            System.out.println("La hora se encuentra fuera del rango.");
        } else if(m < 0 || m > 60) {
            System.out.println("Los minutos se encuentran fuera del rango.");
        } else if(s < 0 || s > 60){
            System.out.println("Los segundos se encuentran fuera del rango");
        } else {
            System.out.println("La hora ingresada es correcta. " + h + ":" + m + ":" + s);
        }
    }
}
