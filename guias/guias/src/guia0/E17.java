package guia0;

import java.util.Scanner;

public class E17 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingresar nombre: ");
        String nombre = input.nextLine();
        System.out.println("Ingresar edad: ");
        int edad = input.nextInt();
        input.nextLine();
        System.out.println("Ingresar el salario");
        double salario = input.nextDouble();
        input.nextLine();

        if(edad < 16){
            System.out.println("" + nombre + ", no tiene edad para trabajar");
        } else if(edad >+ 19 && edad <= 50){
            salario *= 1.05;
            System.out.println("Salario = " + salario);
        } else if(edad >+ 51 && edad <= 60){
            salario *= 1.1;
            System.out.println("Salario = " + salario);
        } else if(edad > 60){
            salario *= 1.15;
            System.out.println("Salario = " + salario);
        } else {
            System.out.println("Salario = " + salario);
        }
    }
}
