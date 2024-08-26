package guiaAdicional5;

import guiaAdicional5.e4.E4;
import guiaAdicional5.e8.E8;

import java.util.Scanner;

public class G5 {
    public static void ejecutar(Scanner input){

        String seguir;
        int ejercicio;

        do {
            System.out.println("Ingrese el ejercicio que desea ver [1-14]: ");
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
                    E5.ejecutar(input);
                    break;
                case 6:
                    E6.ejecutar(input);
                    break;
                case 7:
                    E7.ejecutar(input);
                    break;
                case 8:
                    E8.ejecutar(input);
                    break;
                case 9:
                    E9.ejecutar(input);
                    break;
                case 10:
                    E10.ejecutar(input);
                    break;
//                case 11:
//                    E11.ejecutar(input);
//                    break;
//                case 12:
//                    E12.ejecutar(input);
//                    break;
//                case 13:
//                    E13.ejecutar(input);
//                    break;
//                case 14:
//                    E14.ejecutar();
//                    break;
                default:
                    System.out.println("Numero de operacion incorrecto");
                    break;
            }

            System.out.println("Desea ver otro ejercicio? [s/cualquier otra tecla]");
            seguir = input.nextLine();

        } while(seguir.equals("s"));
    }
}
