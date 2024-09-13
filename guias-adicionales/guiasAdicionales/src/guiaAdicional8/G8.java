package guiaAdicional8;

import guiaAdicional8.model.Persona;
import guiaAdicional8.service.PersonaService;
import guiaAdicional8.utils.MenuUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class G8 {
    public static void ejecutar(Scanner input){

        ArrayList<Persona> personas = new ArrayList();
        String nombre;
        int edad;
        String profesion;
        Persona persona;

        boolean seguir = true;
        int opcion;

        while(seguir) {
            MenuUtils.mostrarMenu();

            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese el nombre: ");
                    nombre = input.nextLine();
                    System.out.println("Ingrese la edad: ");
                    edad = input.nextInt();
                    input.nextLine();
                    System.out.println("Ingrese la profesion: ");
                    profesion = input.nextLine();

                    PersonaService.agregarPersona(personas, new Persona(nombre, edad, profesion));

                    break;
                case 2:

                    System.out.println("Ingrese el nombre: ");
                    nombre = input.nextLine();

                    persona = PersonaService.buscarPersona(personas, nombre);

                    if(persona != null) {
                        System.out.println(persona.toString());
                    } else {
                        System.out.println("El persona no existe.");
                    }

                    break;
                case 3:

                    System.out.println("Ingrese el nombre: ");
                    nombre = input.nextLine();
                    System.out.println("Ingrese la nueva profesion: ");
                    profesion = input.nextLine();

                    PersonaService.actualizarProfesion(personas, nombre, profesion);

                    break;
                case 4:

                    System.out.println("Ingrese le nombre: ");
                    nombre = input.nextLine();

                    PersonaService.eliminarPersona(personas, nombre);

                    break;
                case 5:

                    System.out.println("El numero total de personas es: " + PersonaService.conteoPersonas(personas));

                    break;
                case 6:

                    Collections.sort(personas);

                    System.out.println("Se ordenaron las personas por edad.");

                    break;
                case 7:

                    System.out.println("Ingrese la profesion: ");
                    profesion = input.nextLine();

                    ArrayList personasProfesion = PersonaService.listadoPorProfesion(personas, profesion);

                    PersonaService.mostrarPersonas(personasProfesion);

                    break;
                case 9:

                    PersonaService.vaciarListado(personas);

                    System.out.println("El listado de personas se vacio.");

                    break;
                case 10:
                    seguir = false;
                    break;
                default:
                    System.out.println("Numero de operacion incorrecto");
                    break;
            }

        }
    }
}
