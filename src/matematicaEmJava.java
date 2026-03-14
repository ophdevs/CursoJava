import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Scanner;

public class matematicaEmJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double x = sc.nextDouble();
        double A, B, C;
        A = Math.sqrt(x);
        B = Math.pow(x, 2.0);
        C = Math.abs(x);

        System.out.printf("O raiz quadrada é %.2f%n", A);
        System.out.printf("O Numero %.2f elevado ao quadrado é %.2f%n", x, B);

        sc.close();
    }
}
