package guia0;

import java.util.Scanner;

public class E7 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingrese una palabra: ");
        String palabra = input.nextLine();
        char charC = input.next().charAt(0);
        int numASCII = charC;

        System.out.println("El valor ASCII del primer caracter de la palabra es: " + numASCII);
    }
}
