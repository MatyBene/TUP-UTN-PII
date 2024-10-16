import model.Curso;
import model.Persona;
import service.JsonService;

public class App {
    public static void main(String[] args) {

        // 1
        Persona persona = new Persona("Juan", 30, "12345678", 'M');
        JsonService.guardarJson(persona, "persona.json");
        System.out.println("El objeto Persona se ha guardado en persona.json");

        //2
        Curso curso = new Curso("Mat", 2);
        curso.agregarPersona(persona);
        JsonService.guardarJson(curso, "curso.json");
    }
}
