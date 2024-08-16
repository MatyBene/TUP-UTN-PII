public class ItemVenta {

    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public ItemVenta(int identificador, String descripcion, int cantidad, double precioUnitario) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioTotal(){
        return (this.precioUnitario * this.cantidad);
    }

    public void imprimirItem(){
        System.out.println("ItemVenta[id=" + this.identificador + ", descripcion=" + this.descripcion + ", cantidad=" + this.cantidad + ", pUnitario=" + this.precioUnitario + ", pTotal=" + calcularPrecioTotal() + "]");
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
