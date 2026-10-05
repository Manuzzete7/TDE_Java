public class DataTeste {
    public static void main(String[] args) {
        Data d = new Data(3, 15, 2026);
        System.out.println("Data: " + d.imprimirData());
        System.out.println("Dias até o mês 3: " + d.calcularDiasAteMes(3));
    }
}
