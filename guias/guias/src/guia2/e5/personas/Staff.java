package guia2.e5.personas;

public class Staff extends Persona{
    private double salario;
    private String turno;

    public Staff(String dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }
}
