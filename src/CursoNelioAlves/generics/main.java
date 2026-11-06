package CursoNelioAlves.generics;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values? :");
        int valor = sc.nextInt();
        sc.nextLine();

        printService<String> ps = new printService<>();

        for (int i = 0; i < valor; i++ ){
            System.out.print("Digite o valor #" + (i+ 1) + " ");
            String value = sc.nextLine();
            ps.addValue(value);
        }

        ps.print();


    }
}
