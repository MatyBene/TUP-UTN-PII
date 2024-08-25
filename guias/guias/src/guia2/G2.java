package guia2;

import java.util.Scanner;

public class G2 {
    public static void ejecutar(Scanner input){

        String seguir;
        int ejercicio;

        do {
            System.out.println("Ingrese el ejercicio que desea ver [1-5]: ");
            ejercicio = input.nextInt();
            input.nextLine();

            switch (ejercicio) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Numero de operacion incorrecto");
                    break;
            }

            System.out.println("Desea ver otro ejercicio? [s/cualquier otra tecla]");
            seguir = input.nextLine();

        } while(seguir.equals("s"));
    }
}
