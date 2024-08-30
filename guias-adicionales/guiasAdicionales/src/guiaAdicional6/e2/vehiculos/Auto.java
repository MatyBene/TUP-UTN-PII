package guiaAdicional6.e2.vehiculos;

public class Auto extends Vehiculo{

    private int puertas;

    public Auto(String marca, String modelo, int anio, double precio, int puertas) {
        super(marca, modelo, anio, precio);
        this.puertas = puertas;
    }
}
