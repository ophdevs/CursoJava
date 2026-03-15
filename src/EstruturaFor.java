import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int x = sc.nextInt() + 1;
        int soma = 0;

        for (int i=1; i < x; i++){
            System.out.printf("digite a soma do numero %d: ", i);
            int y = sc.nextInt();
            soma += y;
        }
        System.out.println(soma);
    }
}
