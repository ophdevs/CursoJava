package exercicios;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixaçãoPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<TaxPayer> tax = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int numPlayers = sc.nextInt();;
        sc.nextLine();

        for (int i = 0; i < numPlayers; i++){
            System.out.printf("Tax payer #%s data: ", i + 1);
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anual = sc.nextDouble();
            sc.nextLine();
            if (type == 'i'){
                System.out.print("Health expenditures: ");
                double plan = sc.nextDouble();
                sc.nextLine();
                tax.add(new Individual(name,anual,plan));
            }else {
                System.out.print("Number of employees: ");
                int func = sc.nextInt();
                sc.nextLine();
                tax.add(new Company(name,anual,func));
            }
        }

        System.out.println(" ");
        System.out.println("TAXES PAID: ");
        double sum = 0;
        for (TaxPayer tp : tax){
            double taxe = tp.tax();
            System.out.println(tp.getName() + " : $ " + String.format("%.2f", taxe));
            sum += taxe;
        }

        System.out.println("TOTAL TAXES: " + sum);


    }
}
