package guiaAdicional3;

import java.util.Scanner;

public class E1 {
    public static void ejecutar(Scanner input){
        int a, b, sum;

        System.out.println("Suma de dos valores");
        System.out.println("Ingrese el primer valor: ");
        a = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el segundo valor: ");
        b = input.nextInt();
        input.nextLine();

        sum = Funcion.suma(a, b);

        System.out.println(a + " + " + b + " = " + sum);
    }
}
