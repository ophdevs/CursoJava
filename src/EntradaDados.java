import java.util.Scanner;

public class EntradaDados {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um texto:");
        String texto = sc.nextLine();
        String texto2 = sc.nextLine();
        System.out.println(texto);
        System.out.println(texto2);
        sc.close();
    }
}
