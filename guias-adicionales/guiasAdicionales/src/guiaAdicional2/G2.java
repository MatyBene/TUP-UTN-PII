package guiaAdicional2;

import java.util.Scanner;

public class G2 {
    public static void ejecutar(Scanner input){

        String seguir;
        int ejercicio;

        do {
            System.out.println("Ingrese el ejercicio que desea ver [1-]: ");
            ejercicio = input.nextInt();

            switch (ejercicio) {

                default:
                    System.out.println("Numero de operacion incorrecto");
                    break;
            }

            System.out.println("Desea ver otro ejercicio? [s/cualquier otra tecla]");
            input.nextLine();
            seguir = input.nextLine();

        } while(seguir.equals("s"));
    }
}
