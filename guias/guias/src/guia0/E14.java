package guia0;

import java.util.Scanner;

public class E14 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingrese un numero de 3 cifras: ");
        String num = input.nextLine();

        if(num.length() == 3){
            System.out.println("" + num.charAt(0));
            System.out.println("" + num.charAt(1));
            System.out.println("" + num.charAt(2));
        } else {
            System.out.println("El numero ingresado no tiene 3 cifras.");
        }
    }
}
