package model;

import java.util.ArrayList;

public class Supervisor extends Personal{

    private ArrayList<Vendedor> vendedores;

    public Supervisor(String legajo, String nombreCompleto, ArrayList<Vendedor> vendedores) {
        super(legajo, nombreCompleto);
        this.vendedores = vendedores;
    }

    @Override
    public void calcularSueldo() {

        double
        this.sueldo = 600000;
    }
}
