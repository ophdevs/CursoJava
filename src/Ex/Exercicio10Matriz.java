package Ex;

import java.util.Scanner;

public class Exercicio10Matriz {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de colunas: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o numero de linhas: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        int[][] mat = new int[num1][num2];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite um numero: ");
        int x = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position:" + i + "," + j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Direita: " + mat[i][j + 1]);
                    }

                    if (i < mat.length - 1) {
                        System.out.println("Baixo: " + mat[i + 1] [j]);
                    }
                }
            }
        }
    }
}
