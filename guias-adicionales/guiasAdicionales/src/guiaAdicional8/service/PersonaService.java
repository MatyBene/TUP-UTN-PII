package guiaAdicional8.service;

import guiaAdicional8.model.Persona;

import java.util.ArrayList;

public class PersonaService {

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
}
