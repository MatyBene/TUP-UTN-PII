import model.Tienda;
import service.JsonManager;

public class App {
    public static void main(String[] args) {

        Tienda tienda = JsonManager.mapeoTienda();

        tienda.filtrarPortatiles();
        tienda.filtrarXPrecioYMarca(1000, "ByteMachines");
        tienda.filtrarXUnidadesYEspecificaciones(100,"Tipo de Tecla","Mecánico");

    }
}
