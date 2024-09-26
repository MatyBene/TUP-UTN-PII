package guia6.e3;

import java.util.Scanner;

public class E3 {
    public static void ejecutar(Scanner input){

        System.out.println("-- Calculadora de enteros --");
        OperacionMatematica<Integer> calculadoraEnteros = new OperacionMatematica<>();
        calculadoraEnteros.setNumeros(10, 2);
        System.out.println("Suma: " + calculadoraEnteros.sumar());
        System.out.println("Resta: " + calculadoraEnteros.restar());
        System.out.println("Multiplicacion: " + calculadoraEnteros.multiplicar());
        try{
            System.out.println("Division: " + calculadoraEnteros.dividir());
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");

        System.out.println("-- Calculadora de double --");
        OperacionMatematica<Double> calculadoraDoubles = new OperacionMatematica<>();
        calculadoraDoubles.setNumeros(10.4, 2.1);
        System.out.println("Suma: " + calculadoraDoubles.sumar());
        System.out.println("Resta: " + calculadoraDoubles.restar());
        System.out.println("Multiplicacion: " + calculadoraDoubles.multiplicar());
        try{
            System.out.println("Division: " + calculadoraDoubles.dividir());
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");


    }
}
