package guiaAdicional3;

import java.util.Scanner;

public class G3 {
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
                    E4.ejecutar(input);
                    break;
                case 5:
                    System.out.println("HACER.");
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
