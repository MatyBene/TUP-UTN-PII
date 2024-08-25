package guia1.e2;

public class CuentaBancaria {

    private String id;
    private String nombre;
    private double balance;

    public CuentaBancaria(String id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public void credito(double cash){
        this.balance += cash;
        System.out.println("Balance: " + this.balance);
    }

    public void debito(double cash){
        if(cash > this.balance){
            System.out.println("No tiene suficiente dinero para retirar la suma especificada.");
        } else {
            this.balance -= cash;
            System.out.println("Balance: " + this.balance);
        }
    }

    public void imprimirCuenta(){
        System.out.println("Identificacion: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Balance: " + this.balance);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

