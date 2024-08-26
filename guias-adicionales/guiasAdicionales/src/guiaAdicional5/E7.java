package guiaAdicional5;

import java.util.Scanner;

public class E7 {
    public static void ejecutar(Scanner input){
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = {5, 4, 3, 2, 1};
        int [] arr3 = new int[5];

        for (int i = 0; i < 5; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
