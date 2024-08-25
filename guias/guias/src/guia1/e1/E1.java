package guia1.e1;

import java.util.Scanner;

public class E1 {
    public static void ejecutar(Scanner input){

        // a
        Empleado emp1 = new Empleado("23456345", "Carlos", "Gutiérrez", 25000);

        // b
        Empleado emp2 = new Empleado("34234123", "Ana", "Sánchez", 27500);

        // c
        emp1.imprimirEmpleado();
        emp2.imprimirEmpleado();

        // d
        emp1.aumentarSalario(15);
        System.out.println("El salario despues del aumento es: " + emp1.getSalario());

    }
}
