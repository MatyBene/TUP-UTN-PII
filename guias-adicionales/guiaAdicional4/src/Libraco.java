public class Libraco {

//    3. Crea una clase "Libro" con atributos de título, autor y año de publicación. Crea
//    un método público para imprimir los detalles del libro.

    private String titulo;
    private String autor;
    private String anioPublicacion;

    public Libraco() {
    }

    public Libraco(String autor, String titulo, String anioPublicacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion='" + anioPublicacion + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
