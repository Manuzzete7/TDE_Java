public class CirculoTeste {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        System.out.println("Raio: " + c.getRaio());
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}
