package guia5.e2;

import java.util.Scanner;

public class E2 {
    public static void ejecutar(Scanner input){

        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();
        input.nextLine();
        System.out.println(devuelveNumero(num));

        System.out.println("El bloque finally siempre se ejecuta y anula cualquier valor de retorno dentro del try o catch. " +
                "\nEsto es lo que sucede en este caso, donde el método retorna siempre 3 sin importar las condiciones anteriores.");

    }

    public static int devuelveNumero(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion");
            }
            return 1;
        } catch (Exception ex) {
            ex.getMessage().concat("Rompi todo y pase por Catch");
            return 2;
        } finally {
            return 3;
        }
    }
}
