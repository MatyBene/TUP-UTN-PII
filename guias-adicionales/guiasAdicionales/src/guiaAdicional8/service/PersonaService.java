package guiaAdicional8.service;

import guiaAdicional8.model.Persona;

import java.util.ArrayList;

public class PersonaService {

    public static void mostrarPersonas(ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public static void agregarPersona(ArrayList<Persona> personas, Persona persona) {
        personas.add(persona);
    }

    public static Persona buscarPersona(ArrayList<Persona> personas, String nombre) {
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                return persona;
            }
        }
        return null;
    }

    public static void actualizarProfesion(ArrayList<Persona> personas, String nombre, String profesion) {
        Persona persona = buscarPersona(personas, nombre);

        if(persona != null) {
            persona.setProfesion(profesion);
            System.out.println("Se actualizo la profesion.");
        } else {
            System.out.println("La persona no existe.");
        }
    }

    public static void eliminarPersona(ArrayList<Persona> personas, String nombre) {
        Persona persona = buscarPersona(personas, nombre);

        if(persona != null) {
            personas.remove(persona);
        } else {
            System.out.println("La persona no existe.");
        }
    }

    public static int conteoPersonas(ArrayList<Persona> personas) {

        return personas.size();
    }

    public static ArrayList<Persona> listadoPorProfesion(ArrayList<Persona> personas, String profesion) {
        ArrayList<Persona> personasProfesion = new ArrayList<>();

        for (Persona persona : personas) {
            if(persona.getProfesion().equals(profesion)) {
                personasProfesion.add(persona);
            }
        }

        return personasProfesion;
    }

    public static void vaciarListado(ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            personas.remove(persona);
        }
    }
}
