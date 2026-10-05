public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        setNota1(nota1);
        setNota2(nota2);
    }

    public void setNota1(double nota) {
        if (nota >= 0 && nota <= 10) nota1 = nota;
    }

    public void setNota2(double nota) {
        if (nota >= 0 && nota <= 10) nota2 = nota;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarAprovacao() {
        return calcularMedia() >= 7.0 ? "Aprovado" : "Reprovado";
    }
}
