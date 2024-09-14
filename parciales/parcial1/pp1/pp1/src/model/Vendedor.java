package model;

public class Vendedor extends Personal{

    private double montoTotalVentasMes;

    public Vendedor(String legajo, String nombreCompleto, double montoTotalVentasMes) {
        super(legajo, nombreCompleto);
        this.montoTotalVentasMes = montoTotalVentasMes;
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = 400000;

        if(montoTotalVentasMes > 0 && montoTotalVentasMes <= 500000){
            this.sueldo += (montoTotalVentasMes * 0.1);
        } else if(montoTotalVentasMes >= 500001 && montoTotalVentasMes < 1000000){
            this.sueldo += (montoTotalVentasMes * 0.15);
        } else if(montoTotalVentasMes > 1000000){
            this.sueldo += (montoTotalVentasMes * 0.20);
        }
    }
}
