package guia0;

import java.util.Scanner;

public class E10 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = input.nextDouble();
        input.nextLine();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Longitud = " + longitud);
        System.out.println("Area = " + area);
    }
}
