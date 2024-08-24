package guiaAdicional2;

import java.util.Scanner;

public class E4 {
    public static void ejecutar(Scanner input){

        int resultado;
        System.out.println("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        input.nextLine();

        if (num1 == num2) {
            resultado = num1 * num2;
            System.out.println("resultado = " + resultado);
        } else if (num1 > num2) {
            resultado = num1 - num2;
            System.out.println("resultado = " + resultado);
        } else {
            resultado = num1 + num2;
            System.out.println("resultado = " + resultado);
        }

    }
}
