package Models;

import Enums.Genero;
import Enums.TipoMaterial;
import Interfaces.I_Digital;

public class EBook extends Material implements I_Digital {

    private String formato;
    private Genero genero;

    public EBook(String titulo, String autor, String anio, TipoMaterial tipo, String formato, Genero genero) {
        super(titulo, autor, anio, tipo);
        this.formato = formato;
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public void leer() {

    }

    @Override
    public void resaltarTexto() {

    }

    @Override
    public void narrarParrafo() {

    }

    @Override
    public void cambiarFormato() {

    }

    @Override
    public void descargar() {

    }
}
