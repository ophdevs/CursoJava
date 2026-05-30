<<<<<<< HEAD:src/Circuferencia.java
=======
package metodosEstaticos;

>>>>>>> 90621b692f9f72a07d1a7d753761b0564b5094c1:src/metodosEstaticos/Circuferencia.java
import util.Calculator;

import java.util.Scanner;

import static util.Calculator.*;

public class Circuferencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("digite o raio do triangulo: ");
        double r = sc.nextDouble();

        double c = Calculator.Circunfe(r);
        double v = Calculator.Volume(r);

        System.out.printf("cicuferencia: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("pi:  %.2f %n", Calculator.PI);

        sc.close();

    }


}
