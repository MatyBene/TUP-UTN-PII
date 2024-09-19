package Models;

import Enums.TipoAvion;
import Interfaces.I_CyP;
import Interfaces.I_Todos;

import java.util.ArrayList;

public class Comercial extends Avion implements I_Todos, I_CyP {

    private int cantAzafatas;
    private ArrayList<String> servicios;

    public Comercial(String modelo, TipoAvion tipo, int cantAsientos, String tipoMotor, double capCombustible, String marca, int cantAzafatas, ArrayList<String> servicios) {
        super(modelo, tipo, cantAsientos, tipoMotor, capCombustible, marca);
        this.cantAzafatas = cantAzafatas;
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capCombustible=" + capCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantAsientos=" + cantAsientos +
                ", cantAzafatas=" + cantAzafatas +
                ", servicios=" + servicios +
                '}';
    }

    public int getCantAzafatas() {
        return cantAzafatas;
    }

    public void setCantAzafatas(int cantAzafatas) {
        this.cantAzafatas = cantAzafatas;
    }

    public ArrayList<String> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<String> servicios) {
        this.servicios = servicios;
    }

    @Override
    public void servirComida() {

    }

    @Override
    public void darMantas() {

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
