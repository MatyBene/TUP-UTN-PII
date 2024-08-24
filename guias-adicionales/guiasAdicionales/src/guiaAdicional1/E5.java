package guiaAdicional1;

import java.util.Scanner;

public class E5 {
    public static void ejecutar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ejercicio 5");

        System.out.println("Ingrese un numero: ");
        int num6 = input.nextInt();

        if(num6 > 0 && num6 % 2 == 0){
            System.out.println("El numero ingresado es mayor que cero y positivo.");
        }
        System.out.println("------");

        input.close();

    }
}
