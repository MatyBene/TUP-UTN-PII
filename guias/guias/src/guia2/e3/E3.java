package guia2.e3;

import java.util.Scanner;

public class E3 {
    public static void ejecutar(Scanner input) {

        Cliente [] clientes = new Cliente[10];
        Factura [] facturas = new Factura[10];

        Cliente c1 = new Cliente("Matias", "adsdas@dasda.com", 10, clientes);

        System.out.println(c1.toString());
        System.out.println("-----------------------");

        Factura f1 = new Factura(10000, c1, facturas);

        System.out.println("Monto de la factura sin descuento: " + f1.getMontoTotal());
        f1.calcularMontofinal();
        System.out.println("Monto de la factura con descuento: " + f1.getMontoTotal());
        System.out.println("-----------------------");

        System.out.println(f1.toString());
        System.out.println("-----------------------");
    }
}
