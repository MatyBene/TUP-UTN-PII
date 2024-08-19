import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String seguir;
        int ejercicio;

        do {
            System.out.println("Ingrese el ejercicio que desea ver [1-14]: ");
            ejercicio = input.nextInt();

            switch (ejercicio) {
                // Sentencias de control If / Else / Else if
                case 1:
//                    Determinar si un alumno aprueba o reprueba un curso, sabiendo que aprobará si su
//                    promedio de tres calificaciones (valores enteros de 1 a 10) es mayor o igual a 6;
//                    reprueba en caso contrario.
                {
                    System.out.println("Ingrese la primer calificacion: ");
                    double cal1 = input.nextDouble();
                    System.out.println("Ingrese la segunda calificacion: ");
                    double cal2 = input.nextInt();
                    System.out.println("Ingrese la tercer calificacion: ");
                    double cal3 = input.nextInt();
                    double promedio = (cal1 + cal2 + cal3) / 3;
                    if (promedio >= 6) {
                        System.out.println("El alumno aprobo con " + promedio + " de promedio.");
                    } else {
                        System.out.println("El alumno desaprobo con " + promedio + " de promedio.");
                    }
                    break;
                }
                case 2:
//                    En un almacén se hace un 20% de descuento a los clientes cuya compra supere los
//                    $5000. ¿Cuál será la cantidad que pagará una persona por su compra?
                {
                    System.out.println("Ingrese el monto de la compra: ");
                    double monto = input.nextDouble();
                    if (monto > 5000) {
                        monto = monto * (1 - 0.2);
                        System.out.println("El monto a pagar es de " + monto + " con descuento.");
                    } else {
                        System.out.println("El monto a pagar es de " + monto + " sin descuento.");
                    }
                    break;
                }
                case 3:
//                    Hacer un algoritmo que calcule el total a pagar por la compra de camisas. Si se
//                    compran tres camisas o más se aplica un descuento del 20% sobre el total de la
//                    compra y si son menos de tres camisas un descuento del 10%.
                {
                    double precioCami = 5000;
                    System.out.println("Ingrese la cantidad de camisas que desea comprar: ");
                    int cantCami = input.nextInt();
                    double precioTotal = precioCami * cantCami;
                    if (cantCami >= 3) {
                        precioTotal = precioTotal * (1 - 0.2);
                        System.out.println("El total a pagar es " + precioTotal + " con 20% de descuento.");
                    } else {
                        precioTotal = precioTotal * (1 - 0.1);
                        System.out.println("El total a pagar es " + precioTotal + " con 10% de descuento.");
                    }
                    break;
                }
                case 4:
//                    Desarrolle un algoritmo que lea 2 números enteros; si son iguales que los multiplique,
//                    si el primero es mayor que el segundo que los reste y si no que los sume.
                {
                    int resultado;
                    System.out.println("Ingrese el primer numero: ");
                    int num1 = input.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    int num2 = input.nextInt();
                    if (num1 == num2) {
                        resultado = num1 * num2;
                        System.out.println("resultado = " + resultado);
                    } else if (num1 > num2) {
                        resultado = num1 - num2;
                        System.out.println("resultado = " + resultado);
                    } else {
                        resultado = num1 + num2;
                        System.out.println("resultado = " + resultado);
                    }
                    break;
                }
                case 5:
//                    Desarrolle un algoritmo en el que se almacenen 3 números distintos leídos por
//                    teclado y nos indique cual de los tres es el mayor.
                {
                    System.out.println("Ingrese el primer numero: ");
                    int num1 = input.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    int num2 = input.nextInt();
                    System.out.println("Ingrese el tercer numero: ");
                    int num3 = input.nextInt();
                    if (num1 > num2 && num1 > num3) {
                        System.out.println("El mayor de los numeros es el primer numero: " + num1);
                    } else if (num2 > num1 && num2 > num3) {
                        System.out.println("El mayor de los numeros es el segundo numero: " + num2);
                    } else {
                        System.out.println("El mayor de los numeros es el tercer numero: " + num3);
                    }
                    break;
                }
                // Ciclo repetitivo While
                case 6:
//                    Desarrolle un algoritmo que permita visualizar los números impares entre el 1 y el 20.
                {
                    int num = 1;
                    while (num <= 20) {
                        if (num % 2 != 0) {
                            System.out.println("num = " + num);
                        }
                        num++;
                    }
                    break;
                }
                case 7:
//                    Realizar un algoritmo que permita cargar de 10 valores por teclado y nos muestre
//                    posteriormente la suma de los valores ingresados y su promedio.
                {
                    int i = 0;
                    int suma = 0;
                    while (i < 10) {
                        System.out.println("Ingrese un numero: ");
                        int num = input.nextInt();
                        suma += num;
                        i++;
                    }
                    System.out.println("La suma de los valores ingresados es: " + suma);
                    double promedio = (double) suma / 10;
                    System.out.println("El promedio es de: " + promedio);
                    break;
                }
                case 8:
//                    Una planta que fabrica perfiles de hierro posee un lote de n piezas. Confeccionar un
//                    programa que pida ingresar por teclado la cantidad de piezas a procesar y luego
//                    ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud esté
//                    comprendida en el rango de 1,20 y 1,30 son aptas. Imprimir por pantalla la cantidad
//                    de piezas aptas que hay en el lote.
                {

                    break;
                }
                // Ciclo repetitivo Do While
                case 9:
//                    Escribir un programa que solicite la carga de números entre 0 y 999 y nos muestre un
//                    mensaje de cuantos digitos tiene cada número. Finalizar el programa cuando se
//                    cargue el valor 0.
                {

                    break;
                }
                case 10:
//                    Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. El
//                    proceso termina cuando ingresamos el valor 0. Se debe informar:
//                    a) ¿Cuántas piezas tienen un peso entre 9.8 Kg y 10.2 Kg.? ¿Cuántas con más de
//                    10.2Kg.? ¿Cuántas con menos de 9.8 Kg.?
//                    b) La cantidad total de piezas procesadas.
                {

                    break;
                }
                // Ciclo repetitivo For
                case 11:
//                    Desarrollar un programa que permita la carga de 10 valores por teclado y nos
//                    muestre posteriormente la suma de los valores ingresados y su promedio.
                {
                    int suma = 0;
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Ingrese un numero: ");
                        int num = input.nextInt();
                        suma += num;
                    }
                    System.out.println("La suma es de: " + suma);
                    double promedio = (double) suma / 10;
                    System.out.println("El promedio es de: " + promedio);
                    break;
                }
                case 12:
//                    Escribir un programa que lea 10 notas de alumnos y nos informe cuántos
//                    tienen notas mayores o iguales a 7 y cuántos menores.
                {
                    int mayores = 0;
                    int menores = 0;
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("Ingrese la nota del alumno " + i + ": ");
                        double nota = input.nextDouble();
                        if (nota >= 7) {
                            mayores++;
                        } else {
                            menores++;
                        }
                    }
                    System.out.println("mayores = " + mayores);
                    System.out.println("menores = " + menores);
                    break;
                }
                case 13:
//                    Calcular e imprimir la tabla de multiplicar de un número cualquiera. Imprimir
//                    el multiplicando, el multiplicador y el producto.
                {
                    System.out.println("Ingrese el numero para conocer su tabla de multiplicar: ");
                    int num = input.nextInt();
                    input.nextLine();
                    for(int i = 1; i <= 10; i++){
                        System.out.println("" + i + " X " + num + " = " + (num * i));
                    }
                    break;
                }
                // Extra
                case 14:
//                    El juego del adivinador
//                        Definir un algoritmo que permita adivinar un número entre 1 y 100. El
//                        algoritmo deberá determinar al azar el número a adivinar (utilizar la clase
//                        Random de Java). El usuario deberá ingresar primero un número, si acertó, el
//                        sistema le informará por pantalla el acierto y luego terminará. Si el número
//                        ingresado por el usuario es mayor o menor que el que tiene que adivinar, el
//                        sistema lo informará por pantalla y continuará hasta que adivine.
                {

                    break;
                }
                default:
                    System.out.println("Numero de operacion incorrecto");
                    break;
            }

            System.out.println("Desea ver otro ejercicio? [s/cualquier otra tecla]");
            input.nextLine();
            seguir = input.nextLine();

        } while (seguir.equals("s"));
    }
}
