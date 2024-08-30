package guia2.e3;

import java.util.UUID;

public class Cliente {

    private String id;
    private String nombre;
    private String email;
    private double descuento;

    public Cliente(String nombre, String email, double descuento, Cliente[] clientes) {
        this.id = generarIdUnico(clientes);
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public String generarIdUnico(Cliente[] clientes){
        String nuevoId;
        int flag;

        do{
            nuevoId = UUID.randomUUID().toString();
            flag = 1;
            for(Cliente cliente : clientes){
                if(cliente != null && cliente.getId().equals(nuevoId)){
                    flag = 0;
                }
            }
        }while(flag == 0);

        return nuevoId;

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
