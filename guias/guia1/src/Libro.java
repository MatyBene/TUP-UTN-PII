public class Libro {

    private static int idCont = 1;
    private int id;
    private String titulo;
    private String autor;
    private double precio;
    private int cantCopias;

    public Libro(String titulo, String autor, double precio, int cantCopias) {
        this.id = idCont++;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantCopias = cantCopias;
    }

    public void venderLibros(int cantidad){
        if(cantidad > this.cantCopias){
            System.out.println("La operacion no es posible.");
        } else {
            this.cantCopias -= cantidad;
        }
    }

    public void agregarCopias(int cantidad){
        this.cantCopias += cantidad;
    }

    public void imprimirLibro(){
        System.out.println("Libro[id=" + this.id + ", título=" + this.titulo + ", autor=" + this.autor + ", precio=" + this.precio + ", copias disponibles=" + this.cantCopias + "]");
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }
}
