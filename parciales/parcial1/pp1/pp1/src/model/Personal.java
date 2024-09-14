package model;

public abstract class Personal {

    protected String legajo;
    protected String nombreCompleto;
    protected double sueldo;

    public Personal(String legajo, String nombreCompleto) {
        this.legajo = legajo;
        this.nombreCompleto = nombreCompleto;
    }

    public abstract void calcularSueldo();
}
