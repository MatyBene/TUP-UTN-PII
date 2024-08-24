package guiaAdicional2;

import java.util.Scanner;

public class E7 {
    public static void ejecutar(Scanner input){

        int i = 0;
        int suma = 0;

        while (i < 10) {
            System.out.println("Ingrese un numero: ");
            int num = input.nextInt();
            input.nextLine();
            suma += num;
            i++;
        }

        System.out.println("La suma de los valores ingresados es: " + suma);
        double promedio = (double) suma / 10;
        System.out.println("El promedio es de: " + promedio);

    }
}
