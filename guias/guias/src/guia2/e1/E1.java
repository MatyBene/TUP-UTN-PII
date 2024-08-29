package guia2.e1;

import guia2.e1.empleados.*;

import java.util.Scanner;

public class E1 {
    public static void ejecutar(Scanner input){

        Empleado [] empleados = new Empleado[10];
        int vEmpl = 0;
        int control;
        String nombre;
        double salario;
        double tarifaHora;
        int horas;
        double tarifaProyecto;

        do {
            System.out.println(
                    "--- Sistema de Gestión de Empleados ---" +
                            "\n1. Agregar Empleado a Tiempo Completo" +
                            "\n2. Agregar Empleado por Horas" +
                            "\n3. Agregar Empleado Contratista" +
                            "\n4. Calcular y Mostrar Pago de Todos los Empleados" +
                            "\n5. Salir" +
                            "\nSeleccione una opción: "
            );

            control = input.nextInt();
            input.nextLine();

            switch (control) {
                case 1:
                    if (vEmpl < empleados.length) {
                        System.out.print("Ingrese nombre del empleado: ");
                        nombre= input.nextLine();
                        System.out.print("Ingrese salario mensual: ");
                        salario = input.nextDouble();
                        input.nextLine();
                        empleados[vEmpl] = new EmpleadoTiempoCompleto(nombre, salario);
                        vEmpl++;
                    } else {
                        System.out.println("No se pueden agregar más empleados. Capacidad máxima alcanzada.");
                    }
                    break;
                case 2:
                    if (vEmpl < empleados.length) {
                        System.out.print("Ingrese nombre del empleado: ");
                        nombre= input.nextLine();
                        System.out.print("Ingrese tarifa por hora: ");
                        tarifaHora = input.nextDouble();
                        input.nextLine();
                        System.out.print("Ingrese horas trabajadas: ");
                        horas = input.nextInt();
                        input.nextLine();
                        empleados[vEmpl] = new EmpleadoPorHoras(nombre, horas, tarifaHora);
                        vEmpl++;
                    } else {
                        System.out.println("No se pueden agregar más empleados. Capacidad máxima alcanzada.");
                    }
                    break;
                case 3:
                    if (vEmpl < empleados.length) {
                        System.out.print("Ingrese nombre del empleado: ");
                        nombre= input.nextLine();
                        System.out.print("Ingrese tarifa por hora: ");
                        tarifaHora = input.nextDouble();
                        input.nextLine();
                        System.out.print("Ingrese horas trabajadas: ");
                        horas = input.nextInt();
                        input.nextLine();
                        System.out.println("Ingrese tarifa por proyecto: ");
                        tarifaProyecto = input.nextDouble();
                        input.nextLine();
                        empleados[vEmpl] = new EmpleadoContratista(nombre, horas, tarifaHora, tarifaProyecto);
                        vEmpl++;
                    } else {
                        System.out.println("No se pueden agregar más empleados. Capacidad máxima alcanzada.");
                    }
                    break;
                case 4:
                    System.out.println("--- Pago de Empleados ---");
                    for (int i = 0; i < vEmpl; i++) {
                        System.out.println("Empleado: " + empleados[i].getNombre() + "\nSalario: " + empleados[i].calcularSalario());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while(control != 5);

    }
}
