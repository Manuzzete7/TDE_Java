public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p = new Produto("Caneta", 2.50, 50);
        System.out.println("Produto: " + p.getNome());
        System.out.println("Valor total: R$" + p.valorTotalEstoque());
        p.repor(10);
        System.out.println("Quantidade após reposição: " + p.getQuantidade());
        p.vender(5);
        System.out.println("Quantidade após venda: " + p.getQuantidade());
    }
}
