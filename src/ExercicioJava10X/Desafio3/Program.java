package ExercicioJava10X.Desafio3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("qual o nome do seu ninja:");
        String nome = sc.nextLine();

        System.out.print("idade do ninja: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Missao: ");
        String missao = sc.nextLine();

        System.out.print("Nivel de dificuldade: ");
        String nivelDificuldade = sc.nextLine();

        System.out.print("Status Missao: ");
        String statusMissao = sc.nextLine();

        System.out.print("QUal habilidade especial: ");
        String habilidadeEspecial = sc.nextLine();

        Uchiha ninja1 = new Uchiha(nome, idade, missao, nivelDificuldade, statusMissao, habilidadeEspecial);

        ninja1.mostrarInformacoes();
        ninja1.mostrarHabilidadeEspecial();


    }
}
