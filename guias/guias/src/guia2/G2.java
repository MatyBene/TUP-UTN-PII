package guia2;

import guia2.e1.E1;
import guia2.e2.E2;
import guia2.e3.E3;

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
                    E1.ejecutar(input);
                    break;
                case 2:
                    E2.ejecutar(input);
                    break;
                case 3:
                    E3.ejecutar(input);
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
