package guiaAdicional1;

import java.util.Scanner;

public class E10 {
    public static void ejecutar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ejercicio 10");

        System.out.println("Ingrese su nombre: ");
        String nombre1 = input.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad1 = input.nextInt();
        System.out.println("Ingrese su correo electronico: ");
        input.nextLine();
        String correo1 = input.nextLine();

        System.out.println("nombre1 = " + nombre1);
        System.out.println("edad1 = " + edad1);
        System.out.println("correo1 = " + correo1);
        System.out.println("------");

        input.close();

    }
}
