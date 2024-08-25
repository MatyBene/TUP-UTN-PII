package guia0;

import java.util.Scanner;

public class E15 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingrese un numero de 5 cifras: ");
        int num = input.nextInt();
        input.nextLine();
        String numStr = Integer.toString(num);

        if(numStr.length() == 5){
            System.out.println("En la posicion 1: " + numStr.charAt(0));
            System.out.println("En la posicion 3: " + numStr.charAt(2));
            System.out.println("En la posicion 5: " + numStr.charAt(4));
        } else {
            System.out.println("El numero no tiene 5 cifras.");
        }
    }
}
