import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Ejercicio 1
        System.out.println("Ejercicio ");
        int num1 = 6;
        int num2 = 4;
        int suma = num1 + num2;
        System.out.println("suma = " + suma);
        System.out.println("------");

        // Ejercicio 2
        System.out.println("Ejercicio 2");
        int b = 10;
        int h = 5;
        int areaRec = b * h;
        System.out.println("areaRec = " + areaRec);
        System.out.println("------");

        // Ejercicio 3
        System.out.println("Ejercicio 3");
        int num3 = 10;
        num3 += 5;
        System.out.println("num3 = " + num3);
        System.out.println("------");

        // Ejercicio 4
        System.out.println("Ejercicio 4");
        int num4 = 6;
        int num5 = 2;
        if(num4 > num5){
            System.out.println("La primera variable es mayor.");
        } else if(num4 < num5){
            System.out.println("La segunda variable es mayor.");
        } else {
            System.out.println("Las variables son iguales.");
        }
        System.out.println("------");

        // Ejercicio 5
        System.out.println("Ejercicio 5");

        System.out.println("Ingrese un numero: ");
        int num6 = input.nextInt();
        if(num6 > 0 && num6 % 2 == 0){
            System.out.println("El numero ingresado es mayor que cero y positivo.");
        }
        System.out.println("------");

        // Ejercicio 6
        System.out.println("Ejercicio 6");
        System.out.println("Ingrese su nombre: ");
        input.nextLine();
        String nombre = input.nextLine();
        System.out.println("nombre = " + nombre);
        System.out.println("------");

        // Ejercicio 7
        System.out.println("Ejercicio 7");
        System.out.println("Ingrese un numero decimal: ");
        double num7 = input.nextDouble();
        num7 = (int) num7;
        System.out.println("num7 = " + num7);
        System.out.println("------");

        // Ejercicio 8
        System.out.println("Ejercicio 8");
        int num8 = 10;
        int resultado = num8 * 5;
        System.out.println("resultado = " + resultado);
        System.out.println("------");

        // Ejercicio 9
        System.out.println("Ejercicio 9");
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        if(edad >= 18 && edad <= 30){
            System.out.println("Se encuentra dentro del rango de edad.");
        }
        System.out.println("------");

        // Ejercicio 10
        System.out.println("Ejercicio 10");
        System.out.println("Ingrese su nombre: ");
        String nombre1 = input.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad1 = input.nextInt();
        System.out.println("Ingrese su correo electronico: ");
        input.nextLine();
        String correo1 = input.nextLine();
        System.out.println("nombre1 = " + nombre1);
        System.out.println("edad1 = " + edad1);
        System.out.println("correo1 = " + correo1);
        System.out.println("------");

        input.close();

    }
}
