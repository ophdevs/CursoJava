import entities.Produto;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Di.gite o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();

        Produto item = new Produto(nome, preco ,quantidade);
        item.setNome("computador");
        System.out.println(item.getNome());

        item.MostrarProdutos();

        System.out.print("Digite a quantidade para adicionar: ");
        int quantAdd = sc.nextInt();
        item.AddProdutos(quantAdd);

        item.MostrarProdutos();

        System.out.print("Digite a quantidade para remover: ");
        int quantRemove = sc.nextInt();
        item.RemoveProdutos(quantRemove);

        item.MostrarProdutos();

    }
}
