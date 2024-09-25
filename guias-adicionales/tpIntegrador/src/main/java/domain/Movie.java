package domain;

public class Movie {
    private String nombre;

    public Movie() {
    }

    public Movie(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
