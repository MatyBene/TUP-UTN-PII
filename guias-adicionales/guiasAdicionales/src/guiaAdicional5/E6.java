package guiaAdicional5;

import java.util.Scanner;

public class E6 {
    public static void ejecutar(Scanner input){
        String [] palabras = {"123", "12345", "12", "123456", "1"};
        String pLarga = palabras[0];

        for (int i = 1; i < palabras.length; i++) {
            if(pLarga.length() < palabras[i].length()){
                pLarga = palabras[i];
            }
        }

        System.out.println("La palabra mas larga es: " + pLarga);
    }
}
