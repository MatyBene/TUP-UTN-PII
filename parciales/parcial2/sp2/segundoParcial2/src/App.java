import model.Persona;
import service.JsonManager;
import service.PersonasList;

public class App {
    public static void main(String[] args) {
        PersonasList<Persona> personas = JsonManager.mapeoPersonas();

        System.out.println(personas.getLista());
    }
}
