package arrays;

import java.util.Scanner;

public class Arranjo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alturas: ");
        int num = sc.nextInt();
        sc.nextLine();
        double[] vect = new double[num];
        for (int i = 0; i < num; i++){
            System.out.println("Digite uma altura: ");
            vect[i] = sc.nextDouble();
        }




        sc.close();
    }
}
