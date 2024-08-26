package guiaAdicional5;

import java.util.Scanner;

public class E9 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingrese una palabra: ");
        String palabra = input.nextLine();

        char [] arrPal = palabra.toCharArray();

        System.out.println("La palabra en orden inverso: ");

        for (int i = arrPal.length - 1; i >= 0; i--) {
            System.out.print(arrPal[i]);
        }

        System.out.println();
    }
}
