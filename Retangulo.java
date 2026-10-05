public class Retangulo {
    private double length = 1.0;
    private double width = 1.0;

    public void setLength(double comprimento) {
        if (comprimento > 0.0 && comprimento < 20.0) {
            this.length = comprimento;
        }
    }

    public void setWidth(double largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.width = largura;
        }
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double calcularArea() { return length * width; }
    public double calcularPerimetro() { return 2 * (length + width); }
}
