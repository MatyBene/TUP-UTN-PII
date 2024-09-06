package guia3.e3.interfaces;

public interface IVehiculo {
    String getMarca();
    void setMarca(String marca);

    String getModelo();
    void setModelo(String modelo);

    double getVelocidadMaxima();
    void setVelocidadMaxima(double velocidadMaxima);

    void mostrarInformacion();
}
