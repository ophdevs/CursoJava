package Ex;

import entities.Funcionario;
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

        for (int i = 0; i < quantFun; i++) {
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            System.out.println("------------------------------------");

            Funcionarios func = new Funcionarios(id, name, salario);
            list.add(func);
        }


        System.out.print("Digite o id do usuario: ");
        int idBusca = sc.nextInt();
        sc.nextLine();
        Integer pos = VerificarID(list, idBusca);

        if (pos == null) {
            System.out.println("ID nao encontrado!");
        } else {
            System.out.println("Digite a porcentagem: ");
            double porcentagem = sc.nextDouble();
            list.get(pos).SalarioTotal(porcentagem);
        }

        for (Funcionarios func : list) {
            System.out.println(func);
        }


        sc.close();
    }

    public static Integer VerificarID(List<Funcionarios> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
