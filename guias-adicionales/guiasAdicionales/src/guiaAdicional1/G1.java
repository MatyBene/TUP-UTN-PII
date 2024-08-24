package guiaAdicional1;

import java.util.Scanner;

public class G1 {
    public static void ejecutar(Scanner input){

        String seguir;
        int ejercicio;

        do {
            System.out.println("Ingrese el ejercicio que desea ver [1-10]: ");
            ejercicio = input.nextInt();
            input.nextLine();

            switch (ejercicio) {
                case 1:
                    E1.ejecutar();
                    break;
                case 2:
                    E2.ejecutar();
                    break;
                case 3:
                    E3.ejecutar();
                    break;
                case 4:
                    E4.ejecutar();
                    break;
                case 5:
                    E5.ejecutar();
                    break;
                case 6:
                    E6.ejecutar();
                    break;
                case 7:
                    E7.ejecutar();
                    break;
                case 8:
                    E8.ejecutar();
                    break;
                case 9:
                    E9.ejecutar();
                    break;
                case 10:
                    E10.ejecutar();
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
