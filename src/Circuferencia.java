import java.util.Scanner;


public class Circuferencia {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o raio do triangulo: ");
        double r = sc.nextDouble();

        double c = Circunfe(r);
        double v = Volume(r);

        System.out.printf("cicuferencia: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("pi:  %.2f %n", PI);

        sc.close();

    }

    public static double Circunfe(double raio) {
        return 2.0 * PI * raio;
    }

    public static double Volume(double raio) {
        return 4.0 * PI * Math.pow(raio, 3.0) / 3.0;
    }

}
