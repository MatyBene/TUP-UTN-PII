package Models;

import Enums.TipoAvion;
import Interfaces.I_CyP;
import Interfaces.I_Privados;
import Interfaces.I_Todos;

public class Privado extends Avion implements I_Todos, I_CyP, I_Privados {

    private boolean jacuzzi;
    private String claveWifi;

    public Privado(String modelo, TipoAvion tipo, int cantAsientos, String tipoMotor, double capCombustible, String marca, boolean jacuzzi, String claveWifi) {
        super(modelo, tipo, cantAsientos, tipoMotor, capCombustible, marca);
        this.jacuzzi = jacuzzi;
        this.claveWifi = claveWifi;
    }

    @Override
    public String toString() {
        return "Privado{" +
                "jacuzzi=" + jacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capCombustible=" + capCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantAsientos=" + cantAsientos +
                '}';
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    @Override
    public void servirComida() {

    }

    @Override
    public void darMantas() {

    }

    @Override
    public boolean verMundial() {
        return false;
    }

    @Override
    public void despegan() {

    }

    @Override
    public void aterrizan() {

    }

    @Override
    public void vuelan() {

    }
}
