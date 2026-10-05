public class Circulo {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public void setRaio(double raio) {
        if (raio > 0) this.raio = raio;
    }

    public double getRaio() { return raio; }

    public double calcularArea() {
        return 3.14159 * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * 3.14159 * raio;
    }
}
