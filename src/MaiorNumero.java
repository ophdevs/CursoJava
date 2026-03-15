import java.util.Scanner;

public class MaiorNumero {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = sc.nextInt();
        System.out.print("Digite um numero: ");
        int b = sc.nextInt();
        System.out.print("Digite um numero: ");
        int c = sc.nextInt();

        int maiorNumero = maior(a, b, c);

        showResult(maiorNumero);

        sc.close();
    }

    public static int maior(int x, int  y, int z) {
        int aux;
        if (x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult (int value){
        System.out.println("O Maior é: " + value);
    }

}
