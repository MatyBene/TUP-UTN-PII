package guiaAdicional2;

import java.util.Scanner;

public class E2 {
    public static void ejecutar(Scanner input){

        System.out.println("Ingrese el monto de la compra: ");
        double monto = input.nextDouble();
        input.nextLine();

        if (monto > 5000) {
            monto = monto * (1 - 0.2);
            System.out.println("El monto a pagar es de " + monto + " con descuento.");
        } else {
            System.out.println("El monto a pagar es de " + monto + " sin descuento.");
        }

    }
}
