package guia3;

import guia3.e1.E1;

import java.util.Scanner;

public class G3 {
    public static void ejecutar(Scanner input){

        String seguir;
        int ejercicio;

        do{
            System.out.println("Ingrese el ejercicio que desea ver [1-3]: ");
            ejercicio = input.nextInt();
            input.nextLine();

            switch(ejercicio){
                case 1:
                    E1.ejecutar(input);
                    break;
                case 2:

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
