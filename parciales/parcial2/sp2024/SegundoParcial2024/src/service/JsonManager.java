package service;

import model.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonManager {

    /**
     * Método que mapea el contenido de un archivo JSON a una colección de personajes del universo Star Wars.
     *
     * @return StarWarsRegistro<Personaje> que contiene la lista de personajes obtenidos del archivo JSON.
     */
    public static StarWarsRegistro<Personaje> mapeoPelicula(){
        // Inicializamos la colección que contendrá los personajes
        StarWarsRegistro<Personaje> personajes = new StarWarsRegistro<>();

        try {
            // Cargamos el archivo JSON que contiene los personajes
            JSONObject json = new JSONObject(JsonUtils.leer("personajes.json"));

            // Obtenemos el array de personajes del JSON
            JSONArray jPersonajes = json.getJSONArray("personajes");

            // Iteramos sobre cada personaje en el array
            for(int i = 0; i < jPersonajes.length(); i++){
                // Creamos un nuevo objeto Personaje
                Personaje personaje = new Personaje();

                // Obtenemos el objeto JSON del personaje actual
                JSONObject jPersonaje = jPersonajes.getJSONObject(i);

                // Obtenemos el objeto JSON del maestro del personaje
                JSONObject jMaestro = jPersonaje.getJSONObject("maestro");

                // Obtenemos el array de habilidades del maestro
                JSONArray jHabilidades = jMaestro.getJSONArray("habilidades");

                // Mapeamos las habilidades del maestro a una lista de strings
                List<String> habilidades = new ArrayList<>();
                for(int ii = 0; ii < jHabilidades.length(); ii++){
                    habilidades.add(jHabilidades.getString(ii));
                }

                // Creamos el objeto Maestro y le asignamos los atributos correspondientes
                Maestro maestro = new Maestro();
                maestro.setNombre(jMaestro.getString("nombre"));
                maestro.setEs_jedi(jMaestro.getBoolean("es_jedi"));
                maestro.setHabilidades(habilidades);

                // Obtenemos el array de amigos del personaje
                JSONArray jAmigos = jPersonaje.getJSONArray("amigos");

                // Mapeamos los amigos del personaje a una lista de objetos Amigo
                List<Amigo> amigos = new ArrayList<>();
                for(int iii = 0; iii < jAmigos.length(); iii++){
                    JSONObject jAmigo = jAmigos.getJSONObject(iii);

                    // Creamos un objeto Amigo y le asignamos sus atributos
                    Amigo amigo = new Amigo();
                    amigo.setNombre(jAmigo.getString("nombre"));
                    amigo.setPiloto(jAmigo.getBoolean("piloto"));

                    // Si el amigo tiene una nave asociada, mapeamos el objeto Nave
                    Nave nave = new Nave();
                    if(jAmigo.isNull("nave")){
                        // Si no hay nave, la dejamos como null
                        amigo.setNave(null);
                    } else {
                        // Si hay nave, la mapeamos y le asignamos sus atributos
                        JSONObject jNave = jAmigo.getJSONObject("nave");
                        nave.setNombre(jNave.getString("nombre"));
                        nave.setModelo(jNave.getString("modelo"));
                        amigo.setNave(nave);
                    }

                    // Agregamos el amigo a la lista
                    amigos.add(amigo);
                }

                // Obtenemos el array de eventos del personaje
                JSONArray jEventos = jPersonaje.getJSONArray("eventos");

                // Mapeamos los eventos del personaje a una lista de objetos Evento
                List<Evento> eventos = new ArrayList<>();
                for(int iv = 0; iv < jEventos.length(); iv++){
                    JSONObject jEvento = jEventos.getJSONObject(iv);

                    // Creamos un objeto Evento y le asignamos sus atributos
                    Evento evento = new Evento();
                    evento.setNombre(jEvento.getString("nombre"));
                    evento.setAnio(jEvento.getInt("anio"));
                    evento.setGanada(jEvento.getBoolean("ganada"));

                    // Agregamos el evento a la lista de eventos
                    eventos.add(evento);
                }

                // Asignamos los atributos del personaje obtenidos del JSON
                personaje.setNombre(jPersonaje.getString("nombre"));
                personaje.setEdad(jPersonaje.getInt("edad"));
                personaje.setJedi(jPersonaje.getBoolean("jedi"));
                personaje.setPlaneta_nacimiento(jPersonaje.getString("planeta_nacimiento"));
                personaje.setMaestro(maestro);
                personaje.setAmigos(amigos);
                personaje.setEventos(eventos);

                // Agregamos el personaje a la colección de personajes
                personajes.agregarPersonaje(personaje);
            }
        } catch (JSONException e) {
            // Si ocurre un error en el mapeo del JSON, se lanza una RuntimeException
            throw new RuntimeException(e);
        }

        // Retornamos la colección de personajes mapeados
        return personajes;
    }

}
