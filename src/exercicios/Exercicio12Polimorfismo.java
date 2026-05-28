package exercicios;

import entities.ImportedProduct;
import entities.UsedProduct;
import entities.comumProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Exercicio12Polimorfismo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of products: ");
        int qnt = sc.nextInt();
        
        comumProduct[] products = new comumProduct[qnt];
        
        sc.nextLine();
        for (int i = 0; i < qnt; i ++){
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i) ? ");
            char type = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();
            if (type == 'i'){
                System.out.print("Custom fee: ");
                double customfee = sc.nextDouble();
                sc.nextLine();
                products[i] = new ImportedProduct(name,price,customfee);
            } else if (type == 'u') {
                System.out.print ("Manufacture Date (DD/MM/YYYY: ");
                String dateStr = sc.nextLine();
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(dateStr, fmt);
                products[i] = new UsedProduct(name,price,date);
            }else {
                products[i] = new comumProduct(name,price);
            }
        }

        for (comumProduct p : products){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
