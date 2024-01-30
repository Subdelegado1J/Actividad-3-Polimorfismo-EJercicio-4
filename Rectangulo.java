public class Rectangulo extends Forma {

    private double longitud;
    private double ancho;

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public Rectangulo(String nombre, double ancho, double longitud) {
        super("Rectangulo");
        this.ancho = ancho;
        this.longitud = longitud;
    }

    @Override
    public double area() {
        double area = ancho * longitud;
        return area;
    }
}
