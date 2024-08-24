package guiaAdicional1;

import java.util.Scanner;

public class E7 {
    public static void ejecutar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ejercicio 7");

        System.out.println("Ingrese un numero decimal: ");

        double num7 = input.nextDouble();
        num7 = (int) num7;

        System.out.println("num7 = " + num7);
        System.out.println("------");

        input.close();

    }
}
