package guia0;

import java.util.Scanner;

public class E20 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();
        input.nextLine();
        int suma = 0;

        for(int i = 0; i <= num; i++){
            suma += i;
        }

        System.out.println("Suma: " + suma);
    }
}
