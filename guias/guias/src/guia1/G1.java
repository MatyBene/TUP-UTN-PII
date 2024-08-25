package guia1;

import guia1.e1.E1;
import guia1.e2.E2;
import guia1.e3.E3;
import guia1.e4.E4;

import java.util.Scanner;

public class G1 {
    public static void ejecutar(Scanner input){

        String seguir;
        int ejercicio;

        do {
            System.out.println("Ingrese el ejercicio que desea ver [1-4]: ");
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
                    E4.ejecutar(input);
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
