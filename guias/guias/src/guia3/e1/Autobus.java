package guia3.e1;

public class Autobus implements ITransporte {

    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    public Autobus(int numeroLinea, int capacidad) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.AUTOBUS;
    }

    public void anunciarParada(String parada){

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
