package guia2.e1.empleados;

public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
