package util;

public class calculator {
    public static  final double PI = 3.14;

    public static double Circunfe(double raio) {
        return 2.0 * PI * raio;
    }

    public static double Volume(double raio) {
        return 4.0 * PI * Math.pow(raio, 3.0) / 3.0;
    }
}
