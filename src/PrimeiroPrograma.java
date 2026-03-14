import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int Num1 = sc.nextInt();
        System.out.print("digite outro numero: ");
        int Num2 = sc.nextInt();
        int soma = Num1 + Num2;
        System.out.printf("a soma entre %d e %d é %d", Num1, Num2, soma);
        sc.close();
    }

}