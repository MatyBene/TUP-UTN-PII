package model;

import java.util.ArrayList;

public class Curso {

    private String nombreCurso;
    private int codigo;
    private ArrayList<Persona> personas;

    public Curso(String nombreCurso, int codigo) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(Persona p){
        this.personas.add(p);
    }

    public void eliminarPersonaXDNI(String dni){
        for(int i = personas.size() - 1; i >= 0 ; i--){
            if(personas.get(i).getDni().equals(dni)){
                personas.remove(i);
            }
        }
    }
}
