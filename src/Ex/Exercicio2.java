package Ex;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite 3 lado do triangulo x: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double perimetro1 = per(a, b, c);
        double area1 = area(perimetro1, a, b, c);

        System.out.println("digite 3 lado do triangulo y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double perimetro2 = per(x, y, z);
        double area2 = area(perimetro2, x, y, z);

        System.out.printf("A area do triangulo x é %.2f%n", area1);
        System.out.printf("A area do triangulo y é %.2f%n", area2);
        if (area1 > area2) {
            System.out.println("Maior area é: x");
        } else {
            System.out.println("Maior area é: y");
        }

        sc.close();
    }

    public static double per(double a, double b, double c) {
        double aux;
        aux = (a + b + c) / 2;
        return aux;
    }

    public static double area(double p, double a, double b, double c) {
        double aux;
        aux = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return aux;
    }
}
