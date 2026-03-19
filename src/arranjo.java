import java.util.Scanner;

public class arranjo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de alturas: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++){
            System.out.printf("Digite a altura %d: ", i);
            vect[i] = sc.nextDouble();
        }

        double soma = 0.00;

        for (int i = 0; i<n; i++){
            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("sua media é %.2f: ",media);






    }
}
