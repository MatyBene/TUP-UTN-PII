package service;

import exception.PersonajeNoEncontrado;
import model.Personaje;

import java.util.ArrayList;
import java.util.List;

public class StarWarsRegistro<T extends Personaje>{

    private List<T> lista;

    public StarWarsRegistro() {
        this.lista = new ArrayList<>();
    }

    public void agregarPersonaje(T personaje){
        try {
            obtenerPersonajePorNombre(personaje.getNombre());

            System.out.println("El personaje ya existe.");
        } catch (PersonajeNoEncontrado e) {
            this.lista.add(personaje);
        }
    }

    public T obtenerPersonajePorNombre(String nombre) throws PersonajeNoEncontrado {
        for(T p : lista){
            if(p instanceof Personaje){
                if(p.getNombre().equals(nombre)){
                    return p;
                }
            }
        }

        throw new PersonajeNoEncontrado("El personaje con el nombre: " + nombre + ", no se encuentra en la base de datos");
    }

    public void eliminarPersonaje(T personaje){
        try {
            obtenerPersonajePorNombre(personaje.getNombre());

            this.lista.remove(personaje);

            System.out.println("El personaje se eliminó.");
        } catch (PersonajeNoEncontrado e) {
            System.out.println("El personaje no existe.");
        }
    }

    public void listarPersonajes(){
        System.out.println(this.lista.toString());
    }

    public void limpiar(){
        this.lista.clear();
    }
}
