package service;

import model.Persona;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonService {

    public static void grabar(JSONArray array){
        try{
            FileWriter file = new FileWriter("archivo.json");
            file.write(arrray.toString());
            file.flush();
            file.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static JSONTokener leer(String archivo){
        JSONTokener tokener = null;

        try{
            tokener = new JSONTokener(new FileReader(archivo);
        } catch(IOException e){
            e.printStackTrace();
        }

        return tokener;
    }

}
