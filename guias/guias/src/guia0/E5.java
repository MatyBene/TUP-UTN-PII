package guia0;

import java.util.Scanner;

public class E5 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingresar un valor: ");
        int A = input.nextInt();
        input.nextLine();

        if(A % 2 == 0){
            System.out.println("El valor A es par.");
        } else {
            System.out.println("El valor de A es impar.");
        }
    }
}
