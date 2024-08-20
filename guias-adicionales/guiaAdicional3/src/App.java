import java.util.Scanner;

public class App {

    public static int suma(int a, int b){
        return (a + b);
    }

    public static void saludo(String nombre){
        System.out.println("Bienvenido, " + nombre);
    }

    public static String esParImpar(int num){
        String resul;

        if(num % 2 == 0){
            resul = "VERDADERO";
        } else {
            resul = "FALSO";
        }

        return resul;
    }

    public static long potencia(int a, int b){
        long resultado;

        resultado = (long) Math.pow(a, b);

        return resultado;
    }

    public static double suma(double a, double b){
        return (a + b);
    }

    public static double resta(double a, double b){
        return (a - b);
    }

    public static double multiplicacion(double a, double b){
        return (a * b);
    }

    public static double division(double a, double b){
        return (a / b);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String seguir;
        int ejercicio;

        do {
            System.out.println("Ingrese el ejercicio que desea ver [1-14]: ");
            ejercicio = input.nextInt();
            input.nextLine();

            switch (ejercicio) {
                case 1:
//                    Crea una función que reciba dos números enteros como parámetros y devuelva
//                    su suma.
                {
                    int a, b, sum;
                    System.out.println("Suma de dos valores");
                    System.out.println("Ingrese el primer valor: ");
                    a = input.nextInt();
                    input.nextLine();
                    System.out.println("Ingrese el segundo valor: ");
                    b = input.nextInt();
                    input.nextLine();
                    sum = suma(a, b);
                    System.out.println(a + " + " + b + " = " + sum);
                    break;
                }
                case 2:
//                    Crea una función que reciba un nombre por parámetro y muestre un mensaje
//                    dándole la bienvenida (función sin return)
                {
                    System.out.println("Ingrese su nombre: ");
                    String nombre = input.nextLine();
                    saludo(nombre);
                    break;
                }
                case 3:
//                    Crea una función que reciba un número entero como parámetro y devuelva
//                    verdadero si es par y falso si es impar.
                {
                    System.out.println("Ingrese un numero, si es par muestra VERDADERO y si es impar FALSO: ");
                    int num = input.nextInt();
                    input.nextLine();
                    System.out.println(esParImpar(num));
                    break;
                }
                case 4:
//                    Crea una función que reciba dos números enteros como parámetros y devuelva
//                    el resultado de elevar el primero a la potencia del segundo.
                {
                    System.out.println("Potencia");
                    System.out.println("Ingrese la base: ");
                    int base = input.nextInt();
                    input.nextLine();
                    System.out.println("Ingrese el exponente: ");
                    int expo = input.nextInt();
                    input.nextLine();
                    System.out.println("El resultado de elevar " + base + " a " + expo + " es igual a " + potencia(base, expo));
                    break;
                }
                case 5:
//                    Realice una pequeña calculadora, utilizando funciones (una función de suma,
//                    una de multiplicación, una de resta, una de división…)
                {
                    break;
                }
                default:
                    System.out.println("Numero de operacion incorrecto");
                    break;
            }

            System.out.println("Desea ver otro ejercicio? [s/cualquier otra tecla]");
            seguir = input.nextLine();

        } while (seguir.equals("s"));
    }
}

