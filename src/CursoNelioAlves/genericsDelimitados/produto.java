package CursoNelioAlves.genericsDelimitados;

public class produto implements Comparable<produto> {
    private String nome;
    private Double preco;

    public produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + ", " + String.format("%.2f",preco);
    }

    @Override
    public int compareTo(produto other) {
        return preco.compareTo(other.getPreco());
    }
}
