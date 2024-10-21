package model;

import java.util.List;

public class Personaje {

    private String nombre;
    private int edad;
    private boolean jedi;
    private String planeta_nacimiento;
    private Maestro maestro;
    private List<Amigo> amigos;
    private List<Evento> eventos;

    public Personaje() {
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", jedi=" + jedi +
                ", planeta_nacimiento='" + planeta_nacimiento + '\'' +
                ", maestro=" + maestro +
                ", amigos=" + amigos +
                ", eventos=" + eventos +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isJedi() {
        return jedi;
    }

    public void setJedi(boolean jedi) {
        this.jedi = jedi;
    }

    public String getPlaneta_nacimiento() {
        return planeta_nacimiento;
    }

    public void setPlaneta_nacimiento(String planeta_nacimiento) {
        this.planeta_nacimiento = planeta_nacimiento;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public List<Amigo> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Amigo> amigos) {
        this.amigos = amigos;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
}
