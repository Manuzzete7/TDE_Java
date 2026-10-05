public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void setHoras(int horas) {
        if (horas >= 0) this.horas = horas;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) this.segundos = segundos;
    }

    public int getHoras() { return horas; }
    public int getMinutos() { return minutos; }
    public int getSegundos() { return segundos; }

    public String imprimirTempo() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public int calcularTotalMinutos() {
        return horas * 60 + minutos;
    }

    public int calcularTotalSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }
}
