package Ex;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Exercicio9Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor n: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i ++){

            for (int j = 0; j < n; j++){
                mat [i][j] = sc.nextInt();
            }
        }

        System.out.println("diagonal principal: ");
        for (int i = 0; i < n; i++){
            System.out.print(mat[i][i] + " ");
        }

        int cont = 0;

        for (int i = 0; i<n; i++){
            for (int j =0; j<n; j++){
                if (mat [i] [j] < 0 ){
                    cont++;
                }
            }
        }

        System.out.println("quantidade repetidas: " + cont);

    }
}
