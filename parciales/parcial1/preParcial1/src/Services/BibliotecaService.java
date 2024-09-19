package Services;

import Enums.Genero;
import Models.Libro;
import Models.Material;
import Utils.ComparadorXAnio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BibliotecaService {

    private ArrayList<Material> catalogo;

    public BibliotecaService() {
        this.catalogo = new ArrayList<>(); // cuando creo la biblioteca se inicializa el array list
    }

    public void listarCatalogo() {
        for (Material material : catalogo) {
            System.out.println(material);
        }
    }

    public void agregarMaterial(Material m){
        catalogo.add(m);
    }

    public String eliminarMaterial(String titulo){
        String msj = "El elemento a eliminar no se encontro en la lista.";

        for(int i = 0; i < catalogo.size(); i++){
            if(titulo.equals(catalogo.get(i).getTitulo())){
                catalogo.remove(i);
                msj = "El elemento se encontro y se elimino correctamente.";
            }
        }

        return msj;
    }

    public Material buscarMaterialXTitulo(String titulo){
        Material m = null;
        for(int i = 0; i < catalogo.size(); i++){
            if(titulo.equals(catalogo.get(i).getTitulo())){
                m = catalogo.get(i);
                break;
            }
        }
        return m;
    }

    public void ordenarMaterialesXTitulo(){
        Collections.sort(catalogo);
    }

    public void ordenarMaterialesXAnio(){
        Collections.sort(catalogo, new ComparadorXAnio());
    }

    public List<Libro> filtrarLibrosXGenero(Genero genero){
        ArrayList<Libro> librosFiltrados = new ArrayList<>();

        for(Material m : catalogo){
            if(m instanceof Libro l){
                if(l.getGenero().equals(genero)){
                    librosFiltrados.add(l);
                }
            }
        }

        return librosFiltrados;
    }



}
