package guiaAdicional2;

import java.util.Scanner;

public class E13 {
    public static void ejecutar(Scanner input){

        System.out.println("Ingrese el numero para conocer su tabla de multiplicar: ");
        int num = input.nextInt();
        input.nextLine();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " X " + num + " = " + (num * i));
        }

    }
}
