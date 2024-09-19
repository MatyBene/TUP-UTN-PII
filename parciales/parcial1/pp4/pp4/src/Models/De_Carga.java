package Models;

import Enums.TipoAvion;
import Interfaces.I_DC;
import Interfaces.I_MyDC;
import Interfaces.I_Todos;

import java.util.ArrayList;

public class De_Carga extends Avion implements I_Todos, I_DC, I_MyDC {

    private double cantKilos;
    private ArrayList<String> productos;

    public De_Carga(String modelo, TipoAvion tipo, String tipoMotor, double capCombustible, String marca, double cantKilos, ArrayList<String> productos) {
        super(modelo, tipo, 0, tipoMotor, capCombustible, marca);
        this.cantKilos = cantKilos;
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "De_Carga{" +
                "cantKilos=" + cantKilos +
                ", productos=" + productos +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capCombustible=" + capCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantAsientos=" + cantAsientos +
                '}';
    }

    public ArrayList<String> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<String> productos) {
        this.productos = productos;
    }

    public double getCantKilos() {
        return cantKilos;
    }

    public void setCantKilos(double cantKilos) {
        this.cantKilos = cantKilos;
    }

    @Override
    public void descargarContenido() {

    }

    @Override
    public boolean ingresar() {
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
