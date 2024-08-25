package guia1.e2;

import java.util.Scanner;

public class E2 {
    public static void ejecutar(Scanner input){
        CuentaBancaria cuenta1 = new CuentaBancaria("m666", "Matias", 15000);

        cuenta1.credito(2500);
        cuenta1.debito(1500);
        cuenta1.debito(30000);

        cuenta1.imprimirCuenta();
    }
}
