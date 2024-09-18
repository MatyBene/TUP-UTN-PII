import Enums.*;
import Models.*;
import Services.BibliotecaService;

public class App {
    public static void main(String[] args) {

        BibliotecaService biblioteca = new BibliotecaService();

        biblioteca.agregarMaterial(new Libro("asd", "benito", "1900", TipoMaterial.LIBRO, 200, Genero.NOVELA));
        biblioteca.agregarMaterial(new Libro("csd", "juan", "1000", TipoMaterial.LIBRO, 100, Genero.DRAMA));
        biblioteca.agregarMaterial(new Libro("bsd", "abel", "2300", TipoMaterial.LIBRO, 300, Genero.NOVELA));
        biblioteca.agregarMaterial(new Libro("x", "x", "x", TipoMaterial.LIBRO, 0, Genero.NOVELA));

        biblioteca.listarCatalogo();

        System.out.println("-------------------------------");

        biblioteca.eliminarMaterial("x");
        biblioteca.listarCatalogo();

        System.out.println("-------------------------------");

        biblioteca.ordenarMaterialesXAnio();
        biblioteca.listarCatalogo();

        System.out.println("-------------------------------");

        biblioteca.ordenarMaterialesXTitulo();
        biblioteca.listarCatalogo();
    }
}