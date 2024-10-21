package service;

import model.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonManager {

    public static Tienda mapeoTienda(){
        Tienda t = new Tienda();

        Inventario<ProductoElectronico> productos = new Inventario<>();

        try{
            JSONObject json = new JSONObject(JsonUtils.leer("tienda.json"));
            JSONObject jTienda = json.getJSONObject("tienda");

            t.setNombre(jTienda.getString("nombre"));
            t.setUbicacion(jTienda.getString("ubicacion"));

            JSONArray jProductos = jTienda.getJSONArray("productos");
            productos.setLista(mapeoProductos(jProductos));

            t.setInventario(productos);

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return t;
    }

    public static List<ProductoElectronico> mapeoProductos(JSONArray jProductos){
        List<ProductoElectronico> productos = new ArrayList<>();

        for(int i = 0; i < jProductos.length(); i++){
            try{
                JSONObject jProducto = jProductos.getJSONObject(i);

                if(jProducto.getString("tipo").equals("DispositivoMovil")){
                    ProductoElectronico d = new DispositivoMovil();
                    d = mapeoProducto(jProducto, d);
                    productos.add(d);
                } else if(jProducto.getString("tipo").equals("Portatil")){
                    ProductoElectronico p = new Portatil();
                    p = mapeoProducto(jProducto, p);
                    productos.add(p);
                } else if(jProducto.getString("tipo").equals("Accesorio")){
                    ProductoElectronico a = new Accesorio();
                    a = mapeoProducto(jProducto, a);
                    productos.add(a);
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        return productos;
    }

    public static ProductoElectronico mapeoProducto(JSONObject jProducto, ProductoElectronico producto){
        try{
            producto.setTipo(jProducto.getString("tipo"));
            producto.setNombre(jProducto.getString("nombre"));
            producto.setMarca(jProducto.getString("marca"));
            producto.setPrecio(jProducto.getDouble("precio"));
            producto.setCantidadDisponible(jProducto.getInt("cantidadDisponible"));
            producto.setSeccionTienda(jProducto.getString("seccionTienda"));

            JSONArray jEspecificaciones = jProducto.getJSONArray("especificaciones");
            producto.setEspecificaciones(mapeoEspecificaciones(jEspecificaciones));

            JSONArray jEmbalajes = jProducto.getJSONArray("embalajesDisponibles");
            producto.setEmbalajesDisponibles(mapeoEmbalajes(jEmbalajes));

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return producto;
    }

    public static List<Especificacion> mapeoEspecificaciones(JSONArray jEspecificaciones){
        List<Especificacion> especificaciones = new ArrayList<>();

        for(int i = 0; i < jEspecificaciones.length(); i++){
            try {
                JSONObject jEspecificacion = jEspecificaciones.getJSONObject(i);
                Especificacion esp = new Especificacion();
                esp = mapeoEspecificacion(jEspecificacion, esp);
                especificaciones.add(esp);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        return especificaciones;
    }

    public static Especificacion mapeoEspecificacion(JSONObject jEspecificacion, Especificacion especificacion){
        try {
            especificacion.setNombre(jEspecificacion.getString("nombre"));
            especificacion.setValor(jEspecificacion.getString("valor"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return especificacion;
    }

    public static List<Embalaje> mapeoEmbalajes(JSONArray jEmbalajes){
        List<Embalaje> embalajes = new ArrayList<>();

        for(int i = 0; i < jEmbalajes.length(); i++){
            try{
                JSONObject jEmbalaje = jEmbalajes.getJSONObject(i);
                Embalaje emb = new Embalaje(jEmbalaje.getString("tipo"),
                                            jEmbalaje.getString("resistencia"),
                                            jEmbalaje.getString("dimensiones"));
//                emb = mapeoEmbalaje(jEmbalaje, emb);
                embalajes.add(emb);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        return embalajes;
    }

//    public static Embalaje mapeoEmbalaje(JSONObject jEmbalaje, Embalaje embalaje) {
//        try {
//            embalaje.setTipo(jEmbalaje.getString("tipo"));
//            embalaje.setResistencia(jEmbalaje.getString("resistencia"));
//            embalaje.setDimensiones(jEmbalaje.getString("dimensiones"));
//        } catch (JSONException e) {
//            throw new RuntimeException(e);
//        }
//
//        return embalaje;
//    }

}
