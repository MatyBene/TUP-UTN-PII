package guia2.e1.empleados;

public class EmpleadoContratista extends Empleado {

    private double horasTrabajadas;
    private double pagoPorHora;
    private double pagoPorProyecto;

    public EmpleadoContratista() {
    }

    public EmpleadoContratista(String nombre, double salario, double horasTrabajadas, double pagoPorHora, double pagoPorProyecto) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularSalario() {
        salario = (horasTrabajadas * pagoPorHora) + pagoPorProyecto;
        return salario;
    }
}
