package guia3.e1;

public class Bicicleta implements Transporte{

    private String numeroSerie;
    private TipoTransporte tipo;

    public void ajustarAsiento(int altura){

    }

    public Bicicleta(String numeroSerie, TipoTransporte tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }

    @Override
    public void arrancar() {

    }

    @Override
    public void detener() {

    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }
}
