package guia2.e5.personas;

public class Estudiante extends Persona{

    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(String dni, String nombre, String apellido, String email, String direccion, int anioIngreso, double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
