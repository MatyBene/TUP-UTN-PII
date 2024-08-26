package guiaAdicional5;

import java.util.Scanner;

public class E3 {
    public static void ejecutar(Scanner input){
        double [] arr = {1.2, 2.3, 3.4, 4.5, 5.6};
        double suma = 0;

        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }

        System.out.println("La suma del arreglo de doubles es: " + suma);
    }
}
