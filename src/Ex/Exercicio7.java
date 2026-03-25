package Ex;

import entities.Pensionato;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL_QUARTOS = 10;

        String[] quartos = new String[TOTAL_QUARTOS];

        System.out.println("digite a quantidade de estudantes que vao alugar : ");
        int quantEstudantes = sc.nextInt();
        sc.nextLine();

        Pensionato[] usuario = new Pensionato[10];


        for (int i = 1; i < quantEstudantes; i++){
            System.out.printf("Digite o nome do quarto %d ", i);
            String nome = sc.nextLine();

            System.out.printf("Digite o email do quarto %d ", i);
            String email = sc.nextLine();

            System.out.println("Qual numero do quarto :");
            int quarto = sc.nextInt();
            sc.nextLine();

            usuario[quarto] = new Pensionato(nome, email, quarto);
        }



        for (int i = 1; i < 10; i++){
            if (usuario[i] != null){
                System.out.println( usuario[i].getQuarto() + ": " + usuario[i].getNome() + ", " + usuario[i].getEmail()
                );
            }
        }


        sc.close();
    }
}
