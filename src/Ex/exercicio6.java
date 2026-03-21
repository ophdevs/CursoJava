package Ex;

import java.util.Scanner;

public class exercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos numeros quer digitar: ");
        int n = sc.nextInt();
        int number [] = new int[n];

        int soma = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            number [i] = sc.nextInt();
            soma += number[i];
        }
        System.out.print("Valores = ");
        for (int i = 0; i < n; i++){
            System.out.print(" " + number [i]);
        }


        int media = soma / n;
        System.out.println(" ");
        System.out.printf("soma : %d%n", soma);
        System.out.printf("media : %d%n",media);





    }
}
