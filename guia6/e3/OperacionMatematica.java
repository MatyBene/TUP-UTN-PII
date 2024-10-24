package guia6.e3;

public class OperacionMatematica <T extends Number> {

    private T num1;
    private T num2;

    public void setNumeros(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar(){
        return num1.doubleValue() + num2.doubleValue();
    }

    public double restar(){
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiplicar(){
        return num1.doubleValue() * num2.doubleValue();
    }

    public double dividir(){
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}
