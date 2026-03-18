package entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double TotalValorEstoque() {
        return preco * quantidade;
    }

    public void AddProdutos(int quantidade) {
        this.quantidade += quantidade; // this é usado para usar o valor de parametro do atributo
    }

    public void RemoveProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public void MostrarProdutos() {
        System.out.printf("Nome: %s, R$ %.2f, %d unidades, total: %.2f %n", nome, preco, quantidade, TotalValorEstoque());

    }
}
