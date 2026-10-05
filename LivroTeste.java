public class LivroTeste {
    public static void main(String[] args) {
        Livro l = new Livro("O Alquimista", "Paulo Coelho", 1988);
        System.out.println("Título: " + l.getTitulo());
        System.out.println("Disponível: " + l.isDisponivel());
        l.emprestar();
        System.out.println("Após empréstimo: " + l.isDisponivel());
        l.devolver();
        System.out.println("Após devolução: " + l.isDisponivel());
    }
}
