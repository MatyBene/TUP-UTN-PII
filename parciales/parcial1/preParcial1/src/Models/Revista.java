package Models;

import Enums.Estado;
import Enums.TipoMaterial;
import Interfaces.I_Prestable;

public class Revista extends Material implements I_Prestable {

    private boolean aColor;
    private Estado estado;

    public Revista(String titulo, String autor, String anio, TipoMaterial tipo, boolean aColor) {
        super(titulo, autor, anio, tipo);
        this.aColor = aColor;
        this.estado = Estado.DISPONIBLE;
    }

    public boolean isaColor() {
        return aColor;
    }

    public void setaColor(boolean aColor) {
        this.aColor = aColor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void prestar() {
        this.estado = Estado.PRESTADO;
    }

    @Override
    public void devolver() {
        this.estado = Estado.DISPONIBLE;
    }
}
