import guiaAdicional1.G1;
import guiaAdicional2.G2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String seguir;
        int guia;

        do {
            System.out.println("Ingrese la guia adicional que desea ver [1-]: ");
            guia = input.nextInt();
            input.nextLine();

            switch (guia) {
                case 1:
                    G1.ejecutar(input);
                    break;
                case 2:
                    G2.ejecutar(input);
                    break;
                default:
                    System.out.println("Numero de operacion incorrecto");
                    break;
            }

            System.out.println("Desea ver otro guia? [s/cualquier otra tecla]");
            seguir = input.nextLine();

        } while(seguir.equals("s"));

        input.close();
    }
}
