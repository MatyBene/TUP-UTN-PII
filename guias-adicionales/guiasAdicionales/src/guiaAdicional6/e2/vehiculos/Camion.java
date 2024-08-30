package guiaAdicional6.e2.vehiculos;

public class Camion extends Vehiculo{

    private double capacidadCarga;

    public Camion(String marca, String modelo, int anio, double precio, double capacidadCarga) {
        super(marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
    }
}
