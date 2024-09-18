package Models;

import Enums.TipoMaterial;

public abstract class Material implements Comparable<Material>{

    private int id = ++Material.cantMateriales;
    protected String titulo;
    protected String autor;
    protected String anio;
    protected TipoMaterial tipo;
    public static int cantMateriales;

    public Material(String titulo, String autor, String anio, TipoMaterial tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.tipo = tipo;
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

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public TipoMaterial getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaterial tipo) {
        this.tipo = tipo;
    }

    @Override
    public int compareTo(Material m) {
        return this.titulo.compareTo(m.titulo);
    }
}
