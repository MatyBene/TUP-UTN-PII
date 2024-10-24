package service;

import model.Amigo;
import model.Persona;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonManager {

    public static PersonasList<Persona> mapeoPersonas(){
        PersonasList<Persona> personas = new PersonasList<>();

        try{
            JSONArray jPersonas = new JSONArray(JsonUtils.leer("personas.json"));

            for(int i = 0; i < jPersonas.length(); i++){
                JSONObject jPersona = jPersonas.getJSONObject(i);
                Persona p = new Persona();

                p = mapeoPersona(jPersona, p);
                personas.agregarPersona(p);
            }

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return personas;
    }

    public static Persona mapeoPersona(JSONObject jPersona, Persona persona) throws JSONException {

        persona.set_id(jPersona.getString("_id"));
        persona.setActive(jPersona.getBoolean("isActive"));
        persona.setBalance(jPersona.getString("balance"));
        persona.setEyeColor(jPersona.getString("eyeColor"));
        persona.setName(jPersona.getString("name"));
        persona.setGender(jPersona.getString("gender"));

        JSONArray jTags = jPersona.getJSONArray("tags");
        persona.setTags(mapeoTags(jTags));

        JSONArray jAmigos = jPersona.getJSONArray("friends");
        persona.setFriends(mapeoFriends(jAmigos));


        return persona;
    }

    public static List<String> mapeoTags(JSONArray jTags) throws JSONException {
        List<String> tags = new ArrayList<>();

        for (int i = 0; i < jTags.length(); i++) {
            tags.add(jTags.getString(i));
        }

        return tags;
    }

    public static List<Amigo> mapeoFriends(JSONArray jAmigos) throws JSONException {
        List<Amigo> amigos = new ArrayList<>();

        for (int i = 0; i < jAmigos.length(); i++) {
            JSONObject jAmigo = jAmigos.getJSONObject(i);
            Amigo amigo = new Amigo();

            amigos.add(mapeoAmigo(jAmigo, amigo));
        }

        return amigos;
    }

    public static Amigo mapeoAmigo(JSONObject jAmigo, Amigo amigo) throws JSONException{
        amigo.setName(jAmigo.getString("name"));
        amigo.setId(jAmigo.getInt("id"));

        return amigo;
    }
}
