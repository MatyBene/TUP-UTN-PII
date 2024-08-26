package guiaAdicional5.e8;

import java.util.Scanner;

public class E8 {
    public static void ejecutar(Scanner input){
        Coche [] autos = {new Coche("Toyota", "Corolla", 2015),
                new Coche("Ford", "Mustang", 2020),
                new Coche("Chevrolet", "Camaro", 2018),
                new Coche("Toyota", "Camry", 2022)};

        System.out.println("Ingresar la marca para ver la lista de autos correspondiente: ");
        String marc = input.nextLine();

        for (int i = 0; i < autos.length; i++) {
            if (autos[i].getMarca().equalsIgnoreCase(marc)){
                System.out.println(autos[i].toString());
            }
        }

    }
}
