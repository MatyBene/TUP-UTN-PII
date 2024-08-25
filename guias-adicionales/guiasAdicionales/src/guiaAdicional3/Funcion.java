package guiaAdicional3;

public class Funcion {
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
}
