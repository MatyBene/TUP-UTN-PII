package guia0;

import java.util.Scanner;

public class E21 {
    public static void ejecutar(Scanner input){
        int cantT = 4;
        double[] temp = new double[cantT];
        double suma = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        double promedio = 0;

        for(int i = 0; i < cantT; i++) {
            System.out.println("Ingresar la temperatura " + (i + 1));
            temp[i] = input.nextDouble();
            input.nextLine();
            suma += temp[i];
            max = Math.max(max, temp[i]);
            min = Math.min(min, temp[i]);
        }

        promedio = suma / cantT;

        System.out.println("Suma: " + suma);
        System.out.println("promedio = " + promedio);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
