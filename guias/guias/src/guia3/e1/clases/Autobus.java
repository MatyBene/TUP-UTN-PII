package guia3.e1.clases;

import guia3.e1.enums.TipoTransporte;
import guia3.e1.interfaces.ITransporte;

public class Autobus implements ITransporte {

    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;
    private String parada;
    private String estado;

    public Autobus(int numeroLinea, int capacidad) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.parada = "1";
        this.tipo = TipoTransporte.AUTOBUS;
    }

    public void proximaParada(String parada){
        this.parada = parada;
    }

    @Override
    public void arrancar() {
        System.out.println("Arranca el " + this.tipo);
        this.estado = "en marcha";
    }

    @Override
    public void detener() {
        System.out.println("Se detiene el " + this.tipo);
        this.estado = "detenido";
    }

    @Override
    public int obtenerCapacidad() {
        return this.capacidad;
    }

    @Override
    public void obtenerEstado() {
        if(this.estado.equals("en marcha")){
            System.out.println("El " + this.tipo +
                    "\ncon numero de linea: " + this.numeroLinea +
                    "\ncon capacidad de: " + this.capacidad +
                    "\nse encuentra " + this.estado +
                    "\ny su proxima parada es: " + this.parada);
        } else if(this.estado.equals("detenido")){
            System.out.println("El " + this.tipo +
                    "\ncon numero de linea: " + this.numeroLinea +
                    "\ncon capacidad de: " + this.capacidad +
                    "\nse encuentra " + this.estado);
        }

    }
}
