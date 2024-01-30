public class Pintura {

    private double cobertura;

    public double getCobertura() {
        return cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double pinturaNecesaria(Forma laforma){
        double pintura = laforma.area() / cobertura;
        return pintura;
    }
}
