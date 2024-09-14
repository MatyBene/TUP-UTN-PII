package model;

import model.enums.Area;

public class Administrador extends Personal{

    private Area areaAsignada;

    public Administrador(String legajo, String nombreCompleto, Area areaAsignada) {
        super(legajo, nombreCompleto);
        this.areaAsignada = areaAsignada;
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = 600000;
    }
}
