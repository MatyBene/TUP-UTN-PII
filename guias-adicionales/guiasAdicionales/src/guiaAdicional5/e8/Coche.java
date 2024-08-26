package guiaAdicional5.e8;

import java.util.Calendar;

public class Coche {

    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Coche() {
    }

    public Coche(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }

    public void determinarAntiguedad(){
        Calendar fechaActual = Calendar.getInstance();
        int year = fechaActual.get(Calendar.YEAR);

        if(year-this.anioFabricacion > 10) {
            System.out.println("Es antiguo");
        }else {
            System.out.println("Es nuevo");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}