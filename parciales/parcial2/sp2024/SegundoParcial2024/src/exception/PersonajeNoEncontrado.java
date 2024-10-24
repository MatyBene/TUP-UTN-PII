package exception;

public class PersonajeNoEncontrado extends RuntimeException {
    public PersonajeNoEncontrado(String message) {
        super(message);
    }
}
