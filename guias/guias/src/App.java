import guia0.G0;
import guia1.G1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String seguir;
        int guia;

        do {
            System.out.println("Ingrese la guia adicional que desea ver [0-]: ");
            guia = input.nextInt();
            input.nextLine();

            switch (guia) {
                case 0:
                    G0.ejecutar(input);
                    break;
                case 1:
                    G1.ejecutar(input);
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
