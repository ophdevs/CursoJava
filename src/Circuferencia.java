import util.calculator;

import java.util.Scanner;

import static util.calculator.*;

public class Circuferencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("digite o raio do triangulo: ");
        double r = sc.nextDouble();

        double c = calculator.Circunfe(r);
        double v = calculator.Volume(r);

        System.out.printf("cicuferencia: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("pi:  %.2f %n", calculator.PI);

        sc.close();

    }


}
