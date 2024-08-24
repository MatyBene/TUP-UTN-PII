package guiaAdicional2;

import java.util.Scanner;

public class E11 {
    public static void ejecutar(Scanner input){

        int suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            int num = input.nextInt();
            input.nextLine();
            suma += num;
        }

        System.out.println("La suma es de: " + suma);
        double promedio = (double) suma / 10;
        System.out.println("El promedio es de: " + promedio);

    }
}
