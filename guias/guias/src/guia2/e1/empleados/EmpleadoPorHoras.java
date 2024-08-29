package guia2.e1.empleados;

public class EmpleadoPorHoras extends Empleado{

    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double pagoPorHora) {
        super(nombre, horasTrabajadas * pagoPorHora);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
}
