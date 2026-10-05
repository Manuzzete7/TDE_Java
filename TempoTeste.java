public class TempoTeste {
    public static void main(String[] args) {
        Tempo t = new Tempo(2, 30, 15);
        System.out.println(t.imprimirTempo());
        System.out.println("Total minutos: " + t.calcularTotalMinutos());
        System.out.println("Total segundos: " + t.calcularTotalSegundos());
    }
}
