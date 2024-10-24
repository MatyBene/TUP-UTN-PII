```java
public class PersonasList <T extends Persona>{

    private List<T> lista;

    public PersonasList() {
        this.lista = new ArrayList<>();
    }
}
```

```java
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
```

```java
    public List<ProductoElectronico> filtrarXPrecioYMarca(double precioMin, String marca) throws ProductoInvalidoException{
    List<ProductoElectronico> productos = new ArrayList<>();

    if (precioMin<0){
        throw new ProductoInvalidoException("El precio no puede ser negativo");
    }else {
        for(ProductoElectronico p : lista){
            if (p.getPrecio()>=precioMin && marca.equals(p.getMarca())){
                productos.add(p);
            }
        }
    }

    return productos;
}
```

