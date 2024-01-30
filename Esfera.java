import java.util.Scanner;

public class Esfera extends Forma {

    double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Esfera(String nombre, double radio) {
        super("esfera");
        this.radio = radio;
    }

    @Override
    public double area() {
        double area = 4*Math.PI*Math.pow(radio,2);
        return area;
    }





}
