package guia3.e3.clases;

import guia3.e3.interfaces.IVehiculo;

public class Bicicleta implements IVehiculo {

    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Bicicleta(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
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
        System.out.println("Bicicleta" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nVelocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
