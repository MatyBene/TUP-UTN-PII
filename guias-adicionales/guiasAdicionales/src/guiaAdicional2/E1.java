package guiaAdicional2;

import java.util.Scanner;

public class E1 {
    public static void ejecutar(Scanner input){

        System.out.println("Ingrese la primer calificacion: ");
        double cal1 = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese la segunda calificacion: ");
        double cal2 = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese la tercer calificacion: ");
        double cal3 = input.nextInt();
        input.nextLine();
        double promedio = (cal1 + cal2 + cal3) / 3;

        if (promedio >= 6) {
            System.out.println("El alumno aprobo con " + promedio + " de promedio.");
        } else {
            System.out.println("El alumno desaprobo con " + promedio + " de promedio.");
        }

    }
}
