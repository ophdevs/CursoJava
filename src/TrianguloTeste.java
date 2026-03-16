import entities.Triangulo;
import java.util.Scanner;

public class TrianguloTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("digite 3 lado do triangulo x: ");
        x.a = sc.nextDouble();
        x.b  = sc.nextDouble();
        x.c = sc.nextDouble();


        System.out.println("digite 3 lado do triangulo y: ");
        y.b= sc.nextDouble();
        y.c= sc.nextDouble();
        y.a = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A area do triangulo x é %.2f%n", areaX);
        System.out.printf("A area do triangulo y é %.2f%n", areaY);

        if (areaY> areaX){
            System.out.println("area Y maior");
        } else {
            System.out.println("area X maior");
        }
    }
}
