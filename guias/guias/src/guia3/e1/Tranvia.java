package guia3.e1;

public class Tranvia implements Transporte{

    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;

    public Tranvia(String ruta, int capacidad, TipoTransporte tipo) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public void cambiarVia(int nuevaVia){

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
