package guia3.e1.clases;

import guia3.e1.enums.TipoTransporte;
import guia3.e1.interfaces.ITransporte;

public class Tranvia implements ITransporte {

    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;
    private String via;
    private String estado;

    public Tranvia(String ruta, int capacidad) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.via = "1";
        this.tipo = TipoTransporte.TRANVIA;
    }

    public void cambiarVia(String nuevaVia){
        this.via = via;
    }

    @Override
    public void arrancar() {
        System.out.println("Arranca el " + this.tipo);
    }

    @Override
    public void detener() {
        System.out.println("Se detiene el " + this.tipo);
    }

    @Override
    public int obtenerCapacidad() {
        return this.capacidad;
    }

    @Override
    public void obtenerEstado() {

    }
}
