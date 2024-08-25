package guiaAdicional3;

import java.util.Scanner;

public class E4 {
    public static void ejecutar(Scanner input){
        System.out.println("Potencia");
        System.out.println("Ingrese la base: ");
        int base = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el exponente: ");
        int expo = input.nextInt();
        input.nextLine();
        System.out.println("El resultado de elevar " + base + " a " + expo + " es igual a " + Funcion.potencia(base, expo));
    }
}
