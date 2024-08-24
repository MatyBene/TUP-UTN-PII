package guiaAdicional1;

import java.util.Scanner;

public class E9 {
    public static void ejecutar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ejercicio 9");
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();

        if(edad >= 18 && edad <= 30){
            System.out.println("Se encuentra dentro del rango de edad.");
        }
        System.out.println("------");

        input.close();

    }
}
