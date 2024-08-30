package guiaAdicional6.e3.productos;

public class Electronico extends Producto{

    private String marca;

    public Electronico(String nombre, double precio, int stock, String marca) {
        super(nombre, precio, stock);
        this.marca = marca;
    }
}
