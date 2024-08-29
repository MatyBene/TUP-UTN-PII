package guia2.e1.empleados;

public class EmpleadoContratista extends Empleado {

    private int horasTrabajadas;
    private double pagoPorHora;
    private double pagoPorProyecto;

    public EmpleadoContratista(String nombre, int horasTrabajadas, double pagoPorHora, double pagoPorProyecto) {
        super(nombre, (horasTrabajadas * pagoPorHora) + pagoPorProyecto);
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
