package guiaAdicional2;

import java.util.Scanner;

public class E10 {
    public static void ejecutar(Scanner input){

        double peso;
        int i = 0, j = 0, k = 0;

        do {
            System.out.println("Ingrese el peso de la pieza: ");
            peso = input.nextDouble();
            input.nextLine();
            if(peso >= 9.8 && peso <= 10.2){
                i++;
            }
            if(peso < 9.8 && peso != 0){
                k++;
            }
            if(peso > 10.2){
                j++;
            }
        } while(peso != 0);

        System.out.println("Piezas entre 9.8 kg y 10.2 kg: " + i);
        System.out.println("Piezas mayores a 10.2 kg: " + j);
        System.out.println("Piezas menores a 9.8 kg: " + k);
        System.out.println("Piezas totales: " + (i + j + k));

    }
}
