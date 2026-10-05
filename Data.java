public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        setMes(mes);
        setDia(dia);
        setAno(ano);
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) this.mes = mes;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) this.dia = dia;
    }

    public void setAno(int ano) {
        if (ano > 0) this.ano = ano;
    }

    public int getMes() { return mes; }
    public int getDia() { return dia; }
    public int getAno() { return ano; }

    public String imprimirData() {
        return dia + "/" + mes + "/" + ano;
    }

    public int calcularDiasAteMes(int mesAlvo) {
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        int total = 0;
        for (int i = 0; i < mesAlvo - 1; i++) {
            total += dias[i];
        }
        return total;
    }
}
