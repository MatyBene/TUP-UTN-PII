package Models;

import Enums.TipoAvion;

public abstract class Avion {

    protected String modelo;
    protected String marca;
    protected double capCombustible;
    protected String tipoMotor;
    protected int cantAsientos;
    protected TipoAvion tipo;

    public Avion(String modelo, TipoAvion tipo, int cantAsientos, String tipoMotor, double capCombustible, String marca) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.cantAsientos = cantAsientos;
        this.tipoMotor = tipoMotor;
        this.capCombustible = capCombustible;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapCombustible() {
        return capCombustible;
    }

    public void setCapCombustible(double capCombustible) {
        this.capCombustible = capCombustible;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
}
