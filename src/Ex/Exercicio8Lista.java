package Ex;

import entities.Funcionarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionarios> list = new ArrayList<>();
        System.out.print("digite a quantidade de Funcionarios: ");
        int quantFun = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < quantFun; i++){
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            Funcionarios func = new Funcionarios(id, name,salario);
            list.add(func);
        }







        sc.close();
    }
}
