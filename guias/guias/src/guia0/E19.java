package guia0;

import java.util.Scanner;

public class E19 {
    public static void ejecutar(Scanner input){
        int cant = 2;
        int[] arr = new int[cant];
        arr[0] = 6;
        arr[1] = 4;
        int suma = 0;
        double promedio = 0;

        for(int i = 0; i < cant; i++){
            suma += arr[i];
        }

        promedio = (double) suma / cant;

        System.out.println("promedio = " + promedio);
    }
}
