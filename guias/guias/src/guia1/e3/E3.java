package guia1.e3;

import java.util.Scanner;

public class E3 {
    public static void ejecutar(Scanner input){
        // a
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 500, 10);

        // b
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 700, 5);

        // c
        libro1.imprimirLibro();
        libro2.imprimirLibro();

        // d
        libro1.venderLibros(3);

        // e
        libro1.imprimirLibro();

        // f
        libro2.venderLibros(8);

        // g
        libro2.agregarCopias(5);

        // h
        libro2.imprimirLibro();
    }
}
