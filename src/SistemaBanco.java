import entities.ContaBanco;

import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("deseja fazer um deposito inicial? s/n");
        String decisao = sc.nextLine();

        double depositoInicial = 0;

        if (decisao.equals("s")){
            System.out.print("digite o valor de deposito ini                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   bc ial: ");
            depositoInicial = sc.nextDouble();
            sc.nextLine();
        }
        ContaBanco user = new ContaBanco(numero, nome, depositoInicial); //nao sei como funciona mas funciona

        user.setSaldo(depositoInicial);

        System.out.println("deseja depositar ou sacar: d/s ");
        String escolha = sc.nextLine();

        if(escolha.equals("d")){
            System.out.println("escolha o valor do deposito: ");
            double deposito = sc.nextDouble();
            user.Deposito(deposito);
            user.Mostrarsaldo();
        } else {
            System.out.println("escolha o valor do saque:");
            double saque = sc.nextDouble();
            user.Saque(saque);
            user.Mostrarsaldo();
        }

    }
}
