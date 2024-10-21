package service;

import model.Personaje;

import java.util.ArrayList;
import java.util.List;

public class StarWarsRegistro<T extends Personaje>{

    private List<T> lista;

    public StarWarsRegistro() {
        this.lista = new ArrayList<>();
    }

    public void agregarPersonaje(T personaje){
        if(obtenerPersonajePorNombre(personaje.getNombre()) == null){
            this.lista.add(personaje);
        } else {
            System.out.println("El personaje ya existe.");
        }
    }

    public T obtenerPersonajePorNombre(String nombre){
        for(T p : lista){
            if(p instanceof Personaje){
                if(p.getNombre().equals(nombre)){
                    return p;
                }
            }
        }

        return null;
    }

    public void eliminarPersonaje(T personaje){
        if(obtenerPersonajePorNombre(personaje.getNombre()) != null){
            this.lista.remove(personaje);
            System.out.println("El personaje se elimino.");
        } else {
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
