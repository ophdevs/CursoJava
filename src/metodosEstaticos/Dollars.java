package metodosEstaticos;

import java.util.Scanner;
import util.Calculator;

public class Dollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do Dollar atua: $ ");
        double dollarAtual = sc.nextDouble();
        System.out.print("Quantos dollar voce quer comprar: $ ");
        double quantDollar = sc.nextDouble();

        double somaDollar = Calculator.SomarDollar(dollarAtual, quantDollar);

        System.out.printf("A quantidade em reais é %.2f", somaDollar);



        sc.close();
    }
}
