package guia0;

import java.util.Scanner;

public class E18 {
    public static void ejecutar(Scanner input){
        System.out.println("Ingrese su altura (m): ");
        double h = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese su peso (kg): ");
        double w = input.nextDouble();
        input.nextLine();

        double imc = w / Math.pow(h, 2);

        if(imc < 18.5){
            System.out.println("Bajo peso");
            System.out.println("IMC: " + imc);
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
            System.out.println("IMC: " + imc);
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
            System.out.println("IMC: " + imc);
        } else {
            System.out.println("Obesidad");
            if(imc >= 30 && imc <= 34.9){
                System.out.println("Obesidad grado 1");
                System.out.println("IMC: " + imc);
            } else if(imc >= 35 && imc <= 39.9){
                System.out.println("Obesidad grado 2");
                System.out.println("IMC: " + imc);
            } else {
                System.out.println("Obesidad grado 3");
                System.out.println("IMC: " + imc);
            }
        }
    }
}
