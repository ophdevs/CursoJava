import util.calculator;

import java.util.Scanner;

import static util.calculator.*;

public class Circuferencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator();

        System.out.print("digite o raio do triangulo: ");
        double r = sc.nextDouble();

        double c = calc.Circunfe(r);
        double v = calc.Volume(r);

        System.out.printf("cicuferencia: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("pi:  %.2f %n", calc.PI);

        sc.close();

    }


}
