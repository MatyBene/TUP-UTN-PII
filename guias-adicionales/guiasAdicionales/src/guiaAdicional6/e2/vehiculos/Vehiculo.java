package guiaAdicional6.e2.vehiculos;

public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precio;

    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }
}
