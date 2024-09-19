package Models;

import Enums.SistemaArmas;
import Enums.TipoAvion;
import Interfaces.I_MyDC;
import Interfaces.I_Todos;

public class Militar extends Avion implements I_Todos, I_MyDC {

    /// ATRIBUTOS
    private SistemaArmas sistemaArmas;
    private int cantBalas;

    /// CONSTRUCTOR
    public Militar(String modelo, TipoAvion tipo, int cantAsientos, String tipoMotor, double capCombustible, String marca, SistemaArmas sistemaArmas, int cantBalas) {
        super(modelo, tipo, cantAsientos, tipoMotor, capCombustible, marca);
        this.sistemaArmas = sistemaArmas;
        this.cantBalas = cantBalas;
    }

    /// TOSTRING
    @Override
    public String toString() {
        return "Militar{" +
                "cantBalas=" + cantBalas +
                ", sistemaArmas='" + sistemaArmas + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capCombustible=" + capCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantAsientos=" + cantAsientos +
                '}';
    }

    /// GETTERS Y SETTERS
    public SistemaArmas getSistemaArmas() {
        return sistemaArmas;
    }

    public void setSistemaArmas(SistemaArmas sistemaArmas) {
        this.sistemaArmas = sistemaArmas;
    }

    public int getCantBalas() {
        return cantBalas;
    }

    public void setCantBalas(int cantBalas) {
        this.cantBalas = cantBalas;
    }

    /// METODOS DE INTERFACES
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
