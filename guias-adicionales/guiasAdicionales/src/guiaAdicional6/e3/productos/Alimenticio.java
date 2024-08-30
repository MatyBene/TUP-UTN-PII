package guiaAdicional6.e3.productos;

public class Alimenticio extends Producto{

    private String fechaCaducidad;

    public Alimenticio(String nombre, double precio, int stock, String fechaCaducidad) {
        super(nombre, precio, stock);
        this.fechaCaducidad = fechaCaducidad;
    }
}
