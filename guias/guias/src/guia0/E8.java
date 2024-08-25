package guia0;

import java.util.Scanner;

public class E8 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingrese un valor: ");
        int C = input.nextInt();
        input.nextLine();

        if(C > 0){
            System.out.println("El valor es positivo.");
        } else if(C < 0){
            System.out.println("El valor es negativo.");
        } else {
            System.out.println("El valor es igual a cero.");
        }

        if(C % 2 == 0){
            System.out.println("El valor es par");
        } else {
            System.out.println("El valor es impar.");
        }

        if(C % 5 == 0){
            System.out.println("El valor es multiplo de 5.");
        }

        if(C % 10 == 0){
            System.out.println("El valor es multiplo de 10.");
        }

        if(C > 100){
            System.out.println("El valor es mayor que 100.");
        } else if(C < 100) {
            System.out.println("El valor es menor que 100.");
        } else {
            System.out.println("El valor es igual a 100.");
        }
    }
}
