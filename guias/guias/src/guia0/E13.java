package guia0;

import java.util.Scanner;

public class E13 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingresas el radio de la esfera para conocer su volumen: ");
        double rad = input.nextDouble();
        input.nextLine();

        double vol = (4.0/3.0) * Math.PI * Math.pow(rad, 3);

        System.out.println("El volumen de la esfera es de: " + vol);
    }
}
