package guia1.e1;

public class Empleado {

    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public double salarioAnual(){
        return this.salario * 12;
    }

    public void aumentarSalario(double porcentaje){
        this.salario *= (1 + (porcentaje / 100));
    }

    public void imprimirEmpleado(){
        System.out.println("Empleado[dni=" + this.dni + ", nombre=" + this.nombre + ", apellido=" + this.apellido + ", salario=" + this.salario + "]");
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

