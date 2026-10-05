public class RetanguloTeste {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.setLength(5);
        r.setWidth(3);
        System.out.println("Comprimento: " + r.getLength());
        System.out.println("Largura: " + r.getWidth());
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }
}
