package guia3.e1;

public class Bicicleta implements ITransporte {

    private String numeroSerie;
    private TipoTransporte tipo;

    public void ajustarAsiento(int altura){

    }

    public Bicicleta(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.tipo = TipoTransporte.BICICLETA;
    }

    @Override
    public void arrancar() {
        System.out.println("Arranca la " + this.tipo);
    }

    @Override
    public void detener() {
        System.out.println("Se detiene la " + this.tipo);
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    @Override
    public void obtenerEstado() {

    }
}
