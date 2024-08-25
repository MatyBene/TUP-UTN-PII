package guiaAdicional3;

import java.util.Scanner;

public class E2 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        Funcion.saludo(nombre);
    }
}
