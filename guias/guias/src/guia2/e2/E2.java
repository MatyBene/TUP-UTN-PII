package guia2.e2;

import java.util.Scanner;

public class E2 {
    public static void ejecutar(Scanner input) {

        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');

        System.out.println(autor1.toString());

        Libro libro1 = new Libro("Effective Java", 450, 150, autor1);

        System.out.println(libro1.toString());

        System.out.println("Modifique el precio: [500]");
        double precio = input.nextDouble();
        input.nextLine();
        libro1.setPrecio(precio);

        System.out.println("Modifique el stock: [50]");
        int stock = input.nextInt();
        input.nextLine();
        libro1.setStock(stock);

        System.out.println(libro1.getAutor());

        libro1.mensaje();

    }
}
