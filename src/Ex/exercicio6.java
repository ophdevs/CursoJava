package Ex;

import java.util.Scanner;

public class exercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros quer digitar: ");
        int n = sc.nextInt();
        int number [] = new int[n];

        int soma = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            number [i] = sc.nextInt();
            soma += number[i];

        }


    }
}
