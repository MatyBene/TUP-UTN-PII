public class Jugador {

//  4. Crea una clase "Jugador" con atributos de nombre, edad y deporte. Crea un
//  método público para imprimir los detalles del jugador.

    private String nombre;
    private int edad;
    private String deporte;

    public Jugador() {
    }

    public Jugador(int edad, String deporte, String nombre) {
        this.edad = edad;
        this.deporte = deporte;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", deporte='" + deporte + '\'' +
                '}';
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
