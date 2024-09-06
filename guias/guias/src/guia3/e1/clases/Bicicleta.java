package guia3.e1.clases;

import guia3.e1.enums.TipoTransporte;
import guia3.e1.interfaces.ITransporte;

public class Bicicleta implements ITransporte {

    private String numeroSerie;
    private TipoTransporte tipo;
    private int alturaAsiento;
    private String estado;

    public void ajustarAsiento(int altura){
        this.alturaAsiento = altura;
    }

    public Bicicleta(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.alturaAsiento = 0;
        this.tipo = TipoTransporte.BICICLETA;
    }

    @Override
    public void arrancar() {
        System.out.println("Arranca la " + this.tipo);
        this.estado = "en marcha";
    }

    @Override
    public void detener() {
        System.out.println("Se detiene la " + this.tipo);
        this.estado = "detenido";
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    @Override
    public void obtenerEstado() {
        if(this.estado.equals("en marcha")){
            System.out.println("El " + this.tipo +
                    "\ncon numero de serie: " + this.numeroSerie +
                    "\ncon capacidad de: 1" +
                    "\nse encuentra " + this.estado);
        } else if(this.estado.equals("detenido")) {
            System.out.println("La " + this.tipo +
                    "\ncon numero de serie: " + this.numeroSerie +
                    "\ncon capacidad de: 1" +
                    "\nse encuentra " + this.estado);
        }
    }
}
