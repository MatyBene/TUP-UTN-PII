import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String seguir;
        int ejercicio;

        do{
            System.out.println("Ingrese el ejercicio que desea ver [1-14]: ");
            ejercicio = input.nextInt();
            input.nextLine();

            switch(ejercicio){
                case 1:
//                    Realizar un programa Java que realice lo siguiente: declarar una variable
//                    numN de tipo int, una variable numA de tipo double y una variable numC de
//                    tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
//                    El valor de cada variable, la suma de numN + numA,
//                    la diferencia de numA - numN, el valor numérico correspondiente al carácter que contiene la
//                    variable numC.
                {
                    int numN = 6;
                    double numA = 3.3;
                    char charC = 'A';
                    int numC = charC;
                    System.out.println("La suma de numN + numA: " + (numN + numA));
                    System.out.println("La diferencia de numA - numN: " + (numA - numN));
                    System.out.println("Valor correspondiente al caracter que contiene la variable numC: " + numC);
                    break;
                }
                case 2:
//                    Realizar un programa Java que realice lo siguiente: declarar dos variables
//                    numX y numY de tipo int, dos variables numN y numM de tipo double y
//                    asigna a cada una un valor. A continuación mostrar por pantalla una serie
//                    de operaciones entre ellas.
                {
                    int numX = 3;
                    int numY = 6;
                    double numN = 9.6;
                    double numM = 2.4;

                    System.out.println("Suma de numX y numY: " + (numX + numY));
                    System.out.println("Diferencia de numX y numY: " + (numX - numY));
                    System.out.println("Producto de numX y numY: " + (numX * numY));
                    System.out.println("Cociente de numX y numY: " + (numX / numY));
                    System.out.println("Suma de numN y numM: " + (numN + numM));
                    System.out.println("Diferencia de numN y numM: " + (numN - numM));
                    System.out.println("Producto de numN y numM: " + (numN * numM));
                    System.out.println("Cociente de numN y numM: " + (numN / numM));
                    System.out.println("Suma de numX y numN: " + (numX + numN));
                    System.out.println("Producto de numY y numM: " + (numY * numM));
                    System.out.println("Cociente de numX y numM: " + (numX / numM));

                    break;
                }
                case 3:
//                    Realizar un programa Java que declare una variable entera N y se le asigne
//                    un valor elegido por el usuario. A continuación escribe las instrucciones para
//                    que el programa realice lo siguiente: incrementar N en 77, reducir su valor a 3,
//                    duplicar su valor.
                {
                    System.out.println("Ingresar un valor: ");
                    int N = input.nextInt();
                    input.nextLine();
                    System.out.println("Valor inicial de N: " + N);
                    N += 77;
                    System.out.println("Después de incrementar en 77, N: " + N);
                    N -= (N - 3);
                    System.out.println("Después de reducir su valor a 3, N: " + N);
                    N *= 2;
                    System.out.println("Después de duplicar su valor, N: " + N);
                    break;
                }
                case 4:
//                    Realizar un programa Java que declare cuatro variables enteras A, B, C y D
//                    y se le asigne un valor a cada una. A continuación realiza las instrucciones
//                    necesarias para que: B tome el valor de C, C tome el valor de A, A tome el
//                    valor de D, D tome el valor de B.
                {
                    int A = 3;
                    int B = 6;
                    int C = 9;
                    int D = 12;

                    System.out.println("Valores originales: ");
                    System.out.println("A = " + A);
                    System.out.println("B = " + B);
                    System.out.println("C = " + C);
                    System.out.println("D = " + D);

                    // Utilizando variable auxiliar
//                    int aux;
//
//                    aux = B;
//                    B = C;
//                    C = A;
//                    A = D;
//                    D = aux;

                    // Sin utilizar variable auxiliar
                    B = B + C;
                    C = B - C;
                    B = B - C;

                    C = C + A;
                    A = C - A;
                    C = C - A;

                    A = A + D;
                    D = A - D;
                    A = A - D;

                    System.out.println("Valores modificados: ");
                    System.out.println("A = " + A);
                    System.out.println("B = " + B);
                    System.out.println("C = " + C);
                    System.out.println("D = " + D);

                    break;
                }
                case 5:
//                    Realizar un programa Java que declare una variable A de tipo entero,
//                    y le asigne un valor. A continuación mostrar un mensaje indicando si A
//                    es par o impar.
                {
                    System.out.println("Ingresar un valor: ");
                    int A = input.nextInt();
                    input.nextLine();
                    if(A % 2 == 0){
                        System.out.println("El valor A es par.");
                    } else {
                        System.out.println("El valor de A es impar.");
                    }
                    break;
                }
                case 6:
//                    Realizar un programa Java que declare una variable B de tipo entero y
//                    asignarle un valor elegido por el usuario. A continuación mostrar un
//                    mensaje indicando si el valor de B es positivo o negativo.
                {
                    System.out.println("Ingresar un valor: ");
                    int B = input.nextInt();
                    input.nextLine();
                    if(B > 0){
                        System.out.println("El valor B es positivo.");
                    } else if(B < 0){
                        System.out.println("El valor B es negativo.");
                    } else {
                        System.out.println("El valor B es cero.");
                    }
                    break;
                }
                case 7:
//                    Realizar un programa Java que encuentre el valor ASCII de un carácter.
//                    Para ello, vamos a pedir un String al usuario y leer solo el primer carácter,
//                    esto lo lograremos con: char caracter = scanner.next().charAt(0);
                {
                    System.out.println("Ingrese una palabra: ");
                    String palabra = input.nextLine();
                    char charC = input.next().charAt(0);
                    int numASCII = charC;
                    System.out.println("El valor ASCII del primer caracter de la palabra es: " + numASCII);
                    break;
                }
                case 8:
//                    Realizar un programa Java que declare una variable C de tipo entero y le
//                    asigne un valor elegido por el usuario. A continuación mostrar un mensaje
//                    indicando si el valor de C es positivo o negativo, si es par o impar, si es
//                    múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.
                {
                    System.out.println("Ingrese un valor: ");
                    int C = input.nextInt();

                    if(C > 0){
                        System.out.println("El valor es positivo.");
                    } else if(C < 0){
                        System.out.println("El valor es negativo.");
                    } else {
                        System.out.println("El valor es igual a cero.");
                    }

                    if(C % 2 == 0){
                        System.out.println("El valor es par");
                    } else {
                        System.out.println("El valor es impar.");
                    }

                    if(C % 5 == 0){
                        System.out.println("El valor es multiplo de 5.");
                    }

                    if(C % 10 == 0){
                        System.out.println("El valor es multiplo de 10.");
                    }

                    if(C > 100){
                        System.out.println("El valor es mayor que 100.");
                    } else if(C < 100) {
                        System.out.println("El valor es menor que 100.");
                    } else {
                        System.out.println("El valor es igual a 100.");
                    }
                    break;
                }
                case 9:
//                    Realizar un programa Java que lea un nombre y muestre por pantalla:
//                    “Buenos días, {NOMBRE}”.
                {
                    System.out.println("Ingrese su nombre: ");
                    String nombre = input.nextLine();
                    System.out.println("Buenos dias, " + nombre);
                    break;
                }
                case 10:
//                Realizar un programa que lee por teclado el valor del radio de una
//                circunferencia, calcula y muestra por pantalla la longitud y el área de la
//                circunferencia.
//                Cálculo de longitud: 2 * PI * radio,
//                cálculo de área: PI * radio^2.
//                Para este ejercicio averiguar sobre la clase Math.
                {
                    System.out.println("Ingrese el radio de la circunferencia: ");
                    double radio = input.nextDouble();

                    double longitud = 2 * Math.PI * radio;
                    double area = Math.PI * Math.pow(radio, 2);

                    System.out.println("Longitud = " + longitud);
                    System.out.println("Area = " + area);

                    break;
                }
                case 11:
//                Realizar un programa que pase una velocidad en Km/h a m/s. La
//                velocidad se lee por teclado. Cálculo:
//                velocidadMS = velocidadKm * 1000 / 3600;
                {
                    System.out.println("Ingresar la valocidad en Km/h para paasarla a m/s: ");
                    double velKm = input.nextDouble();

                    double velMS = velKm * 1000 / 3600;

                    System.out.println("Velocidad en m/s = " + velMS);
                    break;
                }
                case 12:
//                Realizar un programa que lea la longitud de los catetos de un triángulo
//                rectángulo y calcule la longitud de la hipotenusa según el teorema de
//                Pitágoras.
                {
                    System.out.println("Ingresar la longitud del cateto 1: ");
                    double cat1 = input.nextDouble();
                    input.nextLine();
                    System.out.println("Ingresar la longitud del cateto 2: ");
                    double cat2 = input.nextDouble();
                    input.nextLine();

                    double hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

                    System.out.println("La longitud de la hipotenusa es: " + hip);
                    break;
                }
                case 13:
//                Realizar un programa que calcula el volumen de una esfera. El valor de
//                radio se debe pedir por teclado. Cálculo: volumen = 4/3 * PI * radio^3
                {
                    System.out.println("Ingresas el radio de la esfera para conocer su volumen: ");
                    double rad = input.nextDouble();
                    input.nextLine();

                    double vol = 4/3 * Math.PI * Math.pow(rad, 3);

                    System.out.println("El volumen de la esfera es de: " + vol);

                    break;
                }
                case 14:
//                Realizar un programa que lee un número de 3 cifras y muestra sus
//                cifras por separado.
                {
                    System.out.println("Ingrese un numero de 3 cifras: ");
                    String num = input.nextLine();

                    if(num.length() == 3){
                        System.out.println("" + num.charAt(0));
                        System.out.println("" + num.charAt(1));
                        System.out.println("" + num.charAt(2));
                    } else {
                        System.out.println("El numero ingresado no tiene 3 cifras.");
                    }

                    break;
                }
                case 15:
//                Realizar un programa que lea un número entero N de 5 cifras y muestre
//                las cifras que ocupan posiciones impares.
                {

                    break;
                }
                case 16:
//                Realizar un programa que lea tres números enteros H, M, S que
//                contienen hora, minutos y segundos respectivamente, y comprueba si la
//                hora que indican es una hora válida.
                {

                    break;
                }
                case 17:
//                Realizar un programa Java que pida por teclado el nombre, edad y
//                salario de una persona, y muestra el salario dependiendo de:
//                  ● Si es menor de 16 no tiene edad para trabajar
//                  ● Entre 19 y 50 años el salario es un 5 por ciento más
//                  ● Entre 51 y 60 años el salario es un 10 por ciento más
//                  ● Si es mayor de 60 el salario es un 15 por ciento más
                {

                    break;
                }
                case 18:
//                Crea un programa que pida al usuario su altura y su peso, y muestre por
//                pantalla su índice de masa corporal y si se encuentra en un rango
//                saludable.
                {

                    break;
                }
                case 19:
//                Realizar un programa Java que calcule el promedio de un arreglo de
//                números enteros. Realizar variantes con arreglos ya inicializados e ingreso
//                por teclado.
                {

                    break;
                }
                case 20:
//                Realizar un programa Java que solicite un número al usuario y calcule la
//                suma de todos los números naturales, hasta el número recibido inclusive.
                {

                    break;
                }
                case 21:
//                Realizar un programa Java que lea 20 temperaturas correspondientes a
//                un mes y calcule el maximo, el minimo y el promedio. Utilizar un array
//                double.
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

        input.close();
    }
}
