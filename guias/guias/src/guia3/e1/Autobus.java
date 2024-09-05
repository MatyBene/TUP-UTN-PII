package guia3.e1;

public class Autobus implements ITransporte {

    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;
    private String parada;
    private String estado;

    public Autobus(int numeroLinea, int capacidad) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.AUTOBUS;
    }

    public void proximaParada(String parada){
        this.parada = parada;
    }

    @Override
    public void arrancar() {
        System.out.println("Arranca el " + this.tipo);
        estado = "En marcha";
    }

    @Override
    public void detener() {
        System.out.println("Se detiene el " + this.tipo);
        estado = "Detenido";
    }

    @Override
    public int obtenerCapacidad() {
        return this.capacidad;
    }

    @Override
    public void obtenerEstado() {
        System.out.println("El " + this.tipo +
                "");
    }
}
