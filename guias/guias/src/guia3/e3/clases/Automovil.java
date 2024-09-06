package guia3.e3.clases;

import guia3.e3.interfaces.IVehiculoDePasajeros;

public class Automovil implements IVehiculoDePasajeros {

    private String marca;
    private String modelo;
    private double velocidadMaxima;
    private int cantidadPasajeros;

    public Automovil(String marca, String modelo, double velocidadMaxima, int cantidadPasajeros) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public int getCantidadPasajeros() {
        return this.cantidadPasajeros;
    }

    @Override
    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    @Override
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Automóvil" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nVelocidad Máxima: " + velocidadMaxima + " km/h " +
                "\nCantidad de Pasajeros: " + cantidadPasajeros);
    }
}
