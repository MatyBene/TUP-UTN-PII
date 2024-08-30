package guia2.e3;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {

    private String id;
    private double montoTotal;
    private String fecha;
    private Cliente cliente;

    public Factura() {
    }

    public Factura(double montoTotal, Cliente cliente, Factura[] facturas) {
        this.id = generarIdUnico(facturas);
        this.montoTotal = montoTotal;
        this.fecha = LocalDateTime.now().toString();
        this.cliente = cliente;
    }

    public String generarIdUnico(Factura[] facturas){
        String nuevoId;
        int flag;

        do{
            nuevoId = UUID.randomUUID().toString();
            flag = 1;
            for(Factura factura : facturas){
                if(factura != null && factura.getId().equals(nuevoId)){
                    flag = 0;
                }
            }
        }while(flag == 0);

        return nuevoId;

    }

    public void calcularMontofinal(){
        montoTotal *= (1 - (cliente.getDescuento()/100));
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id='" + id + '\'' +
                ", montoTotal=" + montoTotal +
                ", fecha='" + fecha + '\'' +
                ", cliente=" + cliente +
                '}';
    }

    public String getId() {
        return id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
