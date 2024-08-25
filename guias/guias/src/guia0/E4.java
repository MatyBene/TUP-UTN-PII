package guia0;

import java.util.Scanner;

public class E4 {
    public static void ejecutar(Scanner input){
        int A = 3;
        int B = 6;
        int C = 9;
        int D = 12;

        System.out.println("Valores originales: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);

        // Utilizando variable auxiliar
//                    int aux;
//
//                    aux = B;
//                    B = C;
//                    C = A;
//                    A = D;
//                    D = aux;

        // Sin utilizar variable auxiliar
        B = B + C;
        C = B - C;
        B = B - C;

        C = C + A;
        A = C - A;
        C = C - A;

        A = A + D;
        D = A - D;
        A = A - D;

        System.out.println("Valores modificados: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
}
