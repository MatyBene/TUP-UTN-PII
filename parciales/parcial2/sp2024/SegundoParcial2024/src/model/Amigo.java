package model;


public class Amigo {

    private String nombre;
    private boolean piloto;
    private Nave nave;

    public Amigo() {
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "nombre='" + nombre + '\'' +
                ", piloto=" + piloto +
                ", nave=" + nave +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPiloto() {
        return piloto;
    }

    public void setPiloto(boolean piloto) {
        this.piloto = piloto;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }
}
