public class AlunoTeste {
    public static void main(String[] args) {
        Aluno a = new Aluno("Ana", "2026001", 8.5, 7.0);
        System.out.println("Aluna: " + a.getNome());
        System.out.println("Média: " + a.calcularMedia());
        System.out.println("Situação: " + a.verificarAprovacao());
    }
}
