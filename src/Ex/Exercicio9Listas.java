package Ex;

import java.util.Scanner;

public class Exercicio9Listas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos cadastrar: ");
        int quantProd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantProd; i++){
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Valor: ");
            double valor = sc.nextDouble();
        }
        for (int i = 0; i < quantProd; i++){
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Valor: ");
            double valor = sc.nextDouble();
        }

    }
}
