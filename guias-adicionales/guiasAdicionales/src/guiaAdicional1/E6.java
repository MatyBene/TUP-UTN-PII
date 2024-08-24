package guiaAdicional1;

import java.util.Scanner;

public class E6 {
    public static void ejecutar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ejercicio 6");

        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();

        System.out.println("nombre = " + nombre);
        System.out.println("------");

        input.close();

    }
}
