package guia2.e5;

import guia2.e5.personas.*;

import java.util.Scanner;

public class E5 {
    public static void ejecutar(Scanner input){

        Persona [] personal = new Persona[8];

        Persona e1 = new Estudiante("12345678", "Ana", "Martínez", "ana.martinez@email.com", "Calle Falsa 123, Ciudad", 2022, 500.00, "Ingeniería en Sistemas");
        personal[0] = e1;
        Persona e2 = new Estudiante("23456789", "Luis", "Gómez", "luis.gomez@email.com", "Avenida Siempre Viva 456, Ciudad", 2021, 600.00, "Medicina");
        personal[1] = e2;
        Persona e3 = new Estudiante("34567890", "María", "Fernández", "maria.fernandez@email.com", "Calle del Sol 789, Ciudad", 2023, 450.00, "Psicología");
        personal[2] = e3;
        Persona e4 = new Estudiante("45678901", "Javier", "Ruiz", "javier.ruiz@email.com", "Calle del Mar 101, Ciudad", 2020, 550.00, "Arquitectura");
        personal[3] = e4;

        Persona s1 = new Staff("56789012", "Carlos", "Pérez", "carlos.perez@email.com", "Calle del Bosque 202, Ciudad", 2500.00, "mañana");
        personal[4] = s1;
        Persona s2 = new Staff("67890123", "Lucía", "Morales", "lucia.morales@email.com", "Calle de la Luna 303, Ciudad", 3000.00, "noche");
        personal[5] = s2;
        Persona s3 = new Staff("78901234", "Fernando", "Jiménez", "fernando.jimenez@email.com", "Calle de la Estrella 404, Ciudad", 2800.00, "mañana");
        personal[6] = s3;
        Persona s4 = new Staff("89012345", "Elena", "Cruz", "elena.cruz@email.com", "Calle del Río 505, Ciudad", 3200.00, "noche");
        personal[7] = s4;

        int cantEst = 0;
        int cantSt = 0;
        double totalIngresos = 0;

        for(Persona persona : personal){
            if(persona instanceof Estudiante){
                totalIngresos += ((Estudiante) persona).getCuotaMensual();
                cantEst++;
            } else if(persona instanceof Staff){
                cantSt++;
            }
        }

        System.out.println("La cantidad de estudiantes es: " + cantEst);
        System.out.println("La cantidad de staff es: " + cantSt);

        System.out.println("La institucion recibe por mes: " + totalIngresos);

    }
}
