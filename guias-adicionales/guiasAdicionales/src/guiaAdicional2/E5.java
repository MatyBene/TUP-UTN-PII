package guiaAdicional2;

import java.util.Scanner;

public class E5 {
    public static void ejecutar(Scanner input){

        System.out.println("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = input.nextInt();
        input.nextLine();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor de los numeros es el primer numero: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor de los numeros es el segundo numero: " + num2);
        } else {
            System.out.println("El mayor de los numeros es el tercer numero: " + num3);
        }

    }

}
