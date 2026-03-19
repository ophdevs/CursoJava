package Ex;

import java.util.Scanner;

public class Exercicio5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantidade de numeros: ");
        int n = sc.nextInt();
        int[] Number = new int[n];

        for (int i = 0; i < Number.length; i++) {
            System.out.println("Digite um numero: ");
            Number[i] = sc.nextInt();
        }

        System.out.println("numero negativo");

        for (int i = 0; i < Number.length; i++){
            if (Number[i] < 0){
                System.out.printf("%d%n", Number[i]);
            }
        }

    }
}
