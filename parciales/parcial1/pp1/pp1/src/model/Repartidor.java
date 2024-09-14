package model;

public class Repartidor extends Personal{

    private double kmRecorridosMes;

    public Repartidor(String legajo, String nombreCompleto, double kmRecorridosMes) {
        super(legajo, nombreCompleto);
        this.kmRecorridosMes = kmRecorridosMes;
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = 200000 + (5000 * kmRecorridosMes);
    }
}
