public class Pais {

//  5. Crea una clase "País" con atributos de nombre, capital y población. Crea un
//  método público para imprimir los detalles del país.

    private String nombre;
    private String capital;
    private long poblacion;

    public Pais() {
    }

    public Pais(String capital, long poblacion, String nombre) {
        this.capital = capital;
        this.poblacion = poblacion;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }
}
