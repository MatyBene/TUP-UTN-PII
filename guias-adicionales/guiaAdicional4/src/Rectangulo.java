public class Rectangulo {

//    2. Crea una clase "Rectángulo" con atributos de ancho y largo. Crea un método
//    público para imprimir el área y el perímetro del rectángulo.

    private double ancho;
    private double largo;

    public Rectangulo() {
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double area(){
        return (this.ancho * this.largo);
    }

    public double perimetro(){
        return (2 * (this.ancho + this.largo));
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
}
