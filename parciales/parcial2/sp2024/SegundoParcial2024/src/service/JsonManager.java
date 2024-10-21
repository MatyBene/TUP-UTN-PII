package service;

import model.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonManager {

    public static StarWarsRegistro<Personaje> mapeoPelicula(){
        StarWarsRegistro<Personaje> personajes = new StarWarsRegistro<>();

        try{
            // Personajes del JSON
            JSONObject json = new JSONObject(JsonUtils.leer("personajes"));

            // Array de personajes
            JSONArray jPersonajes = json.getJSONArray("personajes");

            for(int i = 0; i < jPersonajes.length(); i++){
                // Personaje JSON
                JSONObject jPersonaje = jPersonajes.getJSONObject(i);

                // Maestro JSON
                JSONObject jMaestro = jPersonaje.getJSONObject("maestro");

                // Habilidades JSON
                JSONArray jHabilidades = jMaestro.getJSONArray("habilidades");

                // Agrego habilidades
                List<String> habilidades = new ArrayList<>();
                for(int ii = 0; ii < jHabilidades.length(); ii++){
                    habilidades.add(jHabilidades.getString(ii));
                }

                // Agrego maestro
                Maestro maestro = new Maestro();
                maestro.setNombre(jMaestro.getString("nombre"));
                maestro.setEs_jedi(jMaestro.getBoolean("es_jedi"));
                maestro.setHabilidades(habilidades);

                

            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return personajes;
    }


}
