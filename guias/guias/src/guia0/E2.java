package guia0;

import java.util.Scanner;

public class E2 {
    public static void ejecutar(Scanner input){
        int numX = 3;
        int numY = 6;
        double numN = 9.6;
        double numM = 2.4;

        System.out.println("Suma de numX y numY: " + (numX + numY));
        System.out.println("Diferencia de numX y numY: " + (numX - numY));
        System.out.println("Producto de numX y numY: " + (numX * numY));
        System.out.println("Cociente de numX y numY: " + (numX / numY));
        System.out.println("Suma de numN y numM: " + (numN + numM));
        System.out.println("Diferencia de numN y numM: " + (numN - numM));
        System.out.println("Producto de numN y numM: " + (numN * numM));
        System.out.println("Cociente de numN y numM: " + (numN / numM));
        System.out.println("Suma de numX y numN: " + (numX + numN));
        System.out.println("Producto de numY y numM: " + (numY * numM));
        System.out.println("Cociente de numX y numM: " + (numX / numM));
    }
}
