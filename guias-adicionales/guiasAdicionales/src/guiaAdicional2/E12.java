package guiaAdicional2;

import java.util.Scanner;

public class E12 {
    public static void ejecutar(Scanner input){

        int mayores = 0;
        int menores = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese la nota del alumno " + i + ": ");
            double nota = input.nextDouble();
            input.nextLine();

            if (nota >= 7) {
                mayores++;
            } else {
                menores++;
            }
        }

        System.out.println("mayores = " + mayores);
        System.out.println("menores = " + menores);

    }
}
