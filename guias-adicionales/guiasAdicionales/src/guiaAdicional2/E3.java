package guiaAdicional2;

import java.util.Scanner;

public class E3 {
    public static void ejecutar(Scanner input){

        double precioCami = 5000;
        System.out.println("Ingrese la cantidad de camisas que desea comprar: ");
        int cantCami = input.nextInt();
        input.nextLine();
        double precioTotal = precioCami * cantCami;

        if (cantCami >= 3) {
            precioTotal = precioTotal * (1 - 0.2);
            System.out.println("El total a pagar es " + precioTotal + " con 20% de descuento.");
        } else {
            precioTotal = precioTotal * (1 - 0.1);
            System.out.println("El total a pagar es " + precioTotal + " con 10% de descuento.");
        }

    }
}
