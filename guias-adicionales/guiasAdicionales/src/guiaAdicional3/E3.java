package guiaAdicional3;

import java.util.Scanner;

public class E3 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingrese un numero, si es par muestra VERDADERO y si es impar FALSO: ");
        int num = input.nextInt();
        input.nextLine();
        System.out.println(Funcion.esParImpar(num));
    }
}
