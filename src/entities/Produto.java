package entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double TotalValorEstoque(){
        return preco * quantidade;
    }

    public void AddProdutos(int quantidade){
        this.quantidade += quantidade; // this é usado para usar o valor de parametro do atributo
    }

    public void RemoveProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    public void MostrarProdutos(){
        System.out.printf("Nome: %s, R$ %.2f, %d unidades, total: %.2f %n", nome, preco, quantidade, TotalValorEstoque());

    }
}
