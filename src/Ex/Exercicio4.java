package Ex;

import entities.ProductArray;

import java.util.Scanner;

public class Exercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos cadastrar: ");
        int n = sc.nextInt();

        ProductArray[] vect = new ProductArray[n];


        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            vect[i] = new ProductArray(nome, preco);
        }

        double soma = 0.0;
        for(int i = 0; i < n; i ++){
            soma += vect[i].getPreco();
        }

        double media = soma / n;

        System.out.printf("a media de preço é : %s", media);


    }
}
