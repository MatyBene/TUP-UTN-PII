package excepciones;

public class ProductoInvalidoException extends RuntimeException {
    public ProductoInvalidoException(String message) {
        super(message);
    }
}