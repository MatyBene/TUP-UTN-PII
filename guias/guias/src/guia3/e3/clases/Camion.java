package guia3.e3.clases;

import guia3.e3.interfaces.IVehiculoDeCarga;

public class Camion implements IVehiculoDeCarga {

    private String marca;
    private String modelo;
    private double velocidadMaxima;
    private double carga;

    public Camion(String marca, String modelo, double velocidadMaxima, double carga) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.carga = carga;
    }

    @Override
    public double getCarga() {
        return this.carga;
    }

    @Override
    public void setCarga(double carga) {
        this.carga = carga;
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
        System.out.println("Camión" +
                "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nVelocidad Máxima: " + this.velocidadMaxima + " km/h" +
                "\nCapacidad de Carga: " + this.carga + " toneladas");
    }
}
