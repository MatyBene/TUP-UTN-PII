# Programacion II

## Guia adicional 6

### Ejercicio 1

- App.java

```java
  public class App {
    public static void main(String[] args) {

//        Cilindro cil1 = new Cilindro();
//
//        System.out.println(cil1.getRadio());
//        System.out.println(cil1.getAltura());
//        System.out.println(cil1.calcularArea());
//        System.out.println(cil1.calcularVolumen());

        Cilindro cil2 = new Cilindro(2, "verde", 5);

        System.out.println(cil2.getRadio());
        System.out.println(cil2.getAltura());
        System.out.println(cil2.calcularArea());
        System.out.println(cil2.calcularVolumen());



    }
}

```

- Circulo.java

```java
public class Circulo {

    protected double radio = 1.0;
    protected String color = "rojo";

    public Circulo() {
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

```

- Cilindro.java

```java
public class Cilindro extends Circulo{

    private double altura = 1.0;

    public Cilindro() {
    }

    public Cilindro(double altura) {
        this.altura = altura;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double calcularArea(){
        double area = (2 * Math.PI * altura + 2 * super.calcularArea());
        return area;
    }

    public double calcularVolumen(){
        return calcularArea() * altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

```
