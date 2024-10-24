import model.Personaje;
import service.JsonManager;
import service.StarWarsRegistro;

public class App {
    public static void main(String[] args) {

        StarWarsRegistro<Personaje> pelicula = JsonManager.mapeoPelicula();

        pelicula.listarPersonajes();

        System.out.println(pelicula.obtenerPersonajePorNombre("Luke Skywalker"));

    }
}
