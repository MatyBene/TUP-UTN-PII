package guiaAdicional8;

import guiaAdicional8.model.Persona;
import guiaAdicional8.service.PersonaService;
import guiaAdicional8.utils.MenuUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class G8 {
    public static void ejecutar(Scanner input){

        ArrayList<Persona> personas = new ArrayList();

        boolean seguir = true;
        int opcion;

        while(seguir) {
            MenuUtils.mostrarMenu();

            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese el nombre: ");
                    String nombre = input.nextLine();
                    System.out.println("Ingrese la edad: ");
                    int edad = input.nextInt();
                    input.nextLine();
                    System.out.println("Ingrese la profesion: ");
                    String profesion = input.nextLine();

                    PersonaService.agregarPersona(personas, new Persona(nombre, edad, profesion));

                    break;
                case 2:

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
