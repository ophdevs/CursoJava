package DefaultMethods;

import DefaultMethods.services.BrazilTaxService;
import DefaultMethods.services.UsaTaxService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor: ");
        Double valor = sc.nextDouble();

        System.out.println("Meses: ");
        int meses = sc.nextInt();

        BrazilTaxService tax = new BrazilTaxService(2.0);
        UsaTaxService tax2 = new UsaTaxService(1.0);

        double payment = tax.payment(valor, meses);
        double payment2 = tax2.payment(valor, meses);

        System.out.println(payment);

    }
}
