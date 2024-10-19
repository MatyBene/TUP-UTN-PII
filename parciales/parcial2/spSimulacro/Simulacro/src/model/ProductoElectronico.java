package model;

import java.util.List;

public abstract class ProductoElectronico {

    protected String tipo;
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadDisponible;
    protected String seccionTienda;
    protected List<Especificacion> especificaciones;
    protected List<Embalaje> embalajesDisponibles;

    public ProductoElectronico() {
    }

    public abstract void detalleTecnico();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getSeccionTienda() {
        return seccionTienda;
    }

    public void setSeccionTienda(String seccionTienda) {
        this.seccionTienda = seccionTienda;
    }

    public List<Especificacion> getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(List<Especificacion> especificaciones) {
        this.especificaciones = especificaciones;
    }

    public List<Embalaje> getEmbalajesDisponibles() {
        return embalajesDisponibles;
    }

    public void setEmbalajesDisponibles(List<Embalaje> embalajesDisponibles) {
        this.embalajesDisponibles = embalajesDisponibles;
    }

    @Override
    public String toString() {
        return "ProductoElectronico{" +
                "tipo=" + tipo +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                ", seccionTienda=" + seccionTienda +
                ", especificaciones=" + especificaciones +
                ", embalajesDisponibles=" + embalajesDisponibles +
                '}';
    }
}
