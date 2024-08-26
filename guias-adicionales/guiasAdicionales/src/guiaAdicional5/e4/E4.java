package guiaAdicional5.e4;

import java.util.Scanner;

public class E4 {
    public static void ejecutar(Scanner input){

        Persona [] personas = {new Persona("Matias", 27, 'm'), new Persona("Aixa", 27, 'f')};

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
        }
    }
}
