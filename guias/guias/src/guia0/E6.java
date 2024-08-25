package guia0;

import java.util.Scanner;

public class E6 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingresar un valor: ");
        int B = input.nextInt();
        input.nextLine();

        if(B > 0){
            System.out.println("El valor B es positivo.");
        } else if(B < 0){
            System.out.println("El valor B es negativo.");
        } else {
            System.out.println("El valor B es cero.");
        }
    }
}
