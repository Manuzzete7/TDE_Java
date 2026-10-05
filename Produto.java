public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public void setPreco(double preco) {
        if (preco > 0) this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) this.quantidade = quantidade;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public void repor(int qtd) {
        if (qtd > 0) quantidade += qtd;
    }

    public void vender(int qtd) {
        if (qtd > 0 && quantidade >= qtd) quantidade -= qtd;
    }
}
