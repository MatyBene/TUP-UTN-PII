package service;

import model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonasList <T extends Persona>{

    private List<T> lista;

    public PersonasList() {
        this.lista = new ArrayList<>();
    }

    public void agregarPersona(T persona){
        this.lista.add(persona);
    }

    public void eliminarPersona(T persona){
        this.lista.remove(persona);
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }


}
