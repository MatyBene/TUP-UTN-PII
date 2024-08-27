package guia2.e1.empleados;

public class EmpleadoPorHoras extends Empleado{

    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(String nombre, double salario, double horasTrabajadas, double pagoPorHora) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario() {
        this.salario = horasTrabajadas * pagoPorHora;
        return salario;
    }




}
