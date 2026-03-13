package Ex;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o raio do circulo: ");
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * (raio * raio);
        System.out.printf("a area do seu circulo é %.2f", area);
        sc.close();
    }
}
