package guia0;

import java.util.Scanner;

public class E3 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingresar un valor: ");
        int N = input.nextInt();
        input.nextLine();

        System.out.println("Valor inicial de N: " + N);

        N += 77;
        System.out.println("Después de incrementar en 77, N: " + N);

        N -= (N - 3);
        System.out.println("Después de reducir su valor a 3, N: " + N);

        N *= 2;
        System.out.println("Después de duplicar su valor, N: " + N);
    }
}
