package util;

public class calculator {
    public static  final double PI = 3.14;

    public static  final double IOF = 0.06;

    public static double Circunfe(double raio) {
        return 2.0 * PI * raio;
    }

    public static double Volume(double raio) {

        return 4.0 * PI * Math.pow(raio, 3.0) / 3.0;
    }

    public static double SomarDollar(double dollar, double quantDollar) {
        double totalSemIof = dollar * quantDollar;
        double imposto = totalSemIof * IOF;

        return totalSemIof + imposto;
    }

}
