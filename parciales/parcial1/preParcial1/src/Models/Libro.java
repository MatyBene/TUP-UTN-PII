package Models;

import Enums.Estado;
import Enums.Genero;
import Enums.TipoMaterial;
import Interfaces.I_Prestable;

public class Libro extends Material implements I_Prestable {

    private int cantPaginas;
    private Genero genero;
    private Estado estado;

    public Libro(String titulo, String autor, String anio, TipoMaterial tipo, int cantPaginas, Genero genero) {
        super(titulo, autor, anio, tipo);
        this.cantPaginas = cantPaginas;
        this.genero = genero;
        this.estado = Estado.DISPONIBLE;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "cantPaginas=" + cantPaginas +
                ", genero=" + genero +
                ", estado=" + estado +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anio='" + anio + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void prestar() {
        if(this.estado == Estado.DISPONIBLE){
            this.estado = Estado.PRESTADO;
        } else {
            System.out.println("El libro no se encuentra disponible.");
        }
    }

    @Override
    public void devolver() {
        this.estado = Estado.DISPONIBLE;
    }
}
