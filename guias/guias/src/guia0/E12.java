package guia0;

import java.util.Scanner;

public class E12 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingresar la longitud del cateto 1: ");
        double cat1 = input.nextDouble();
        input.nextLine();
        System.out.println("Ingresar la longitud del cateto 2: ");
        double cat2 = input.nextDouble();
        input.nextLine();

        double hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

        System.out.println("La longitud de la hipotenusa es: " + hip);
    }
}
