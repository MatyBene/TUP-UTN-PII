package guia3.e1;

public class Autobus implements Transporte{

    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    public Autobus(int numeroLinea, int capacidad, TipoTransporte tipo) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public void anunciarParada(String parada){

    }

    @Override
    public void arrancar() {

    }

    @Override
    public void detener() {

    }

    @Override
    public int obtenerCapacidad() {
        return this.capacidad;
    }
}
