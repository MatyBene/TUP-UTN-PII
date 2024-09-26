package guia6;

import java.util.Scanner;
import guia6.e3.E3;

public class G6 {
    public static void ejecutar(Scanner input) {

        String seguir;
        int ejercicio;

        do {
            System.out.println("Ingrese el ejercicio que desea ver [1-4]: ");
            ejercicio = input.nextInt();
            input.nextLine();

            switch (ejercicio) {
                case 3:
                    E3.ejecutar(input);
                    break;


                default:
                    System.out.println("Numero de operacion incorrecto");
                    break;
            }

            System.out.println("Desea ver otro ejercicio? [s/cualquier otra tecla]");
            seguir = input.nextLine();

        } while (seguir.equals("s"));
    }
}
