package recursividade;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero : ");
        int numero = sc.nextInt();
        System.out.println(calculoFatorial(numero));
        sc.close();
    }

    public static int calculoFatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculoFatorial(n - 1);
    }
}