package Ex;

import entities.Funcionario;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario newFun = new Funcionario();

        System.out.print("digite Seu nome: ");
        newFun.nome = sc.nextLine();
        System.out.print("digite Seu salario: ");
        newFun.salario = sc.nextDouble();
        System.out.print("digite Seu imposto: ");
        newFun.imposto = sc.nextDouble();

        System.out.printf("Seu salario com desconto é: %.2f %n", newFun.NovoSalario());

        System.out.print("digite a porcentagem: ");
        double porcentagem = sc.nextDouble();
        newFun.AcrecentarSalario(porcentagem);


    }
}
