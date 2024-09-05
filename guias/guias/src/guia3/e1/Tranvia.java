package guia3.e1;

public class Tranvia implements ITransporte {

    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;
    private String via;
    private boolean estado;

    public Tranvia(String ruta, int capacidad) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.TRANVIA;
    }

    public void cambiarVia(int nuevaVia){
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
