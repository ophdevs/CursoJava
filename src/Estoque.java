import entities.Produto;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto item = new Produto();

        System.out.print("Digite o nome do produto: ");
        item.nome = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        item.preco = sc.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        item.quantidade = sc.nextInt();

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
