package model;

import java.util.List;

public class Maestro {

    private String nombre;
    private boolean es_jedi;
    private List<String> habilidades;

    public Maestro() {
    }

    @Override
    public String toString() {
        return "Maestro{" +
                "nombre='" + nombre + '\'' +
                ", es_jedi=" + es_jedi +
                ", habilidades=" + habilidades +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEs_jedi() {
        return es_jedi;
    }

    public void setEs_jedi(boolean es_jedi) {
        this.es_jedi = es_jedi;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }
}
