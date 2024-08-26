package guiaAdicional5;

import java.util.Scanner;

public class E5 {
    public static void ejecutar(Scanner input){
        int [] nums = {2, 4, 6, 1, 3, 8, 3};
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        }

        System.out.println("El valor maximo del arreglo es: " + max);
    }
}
