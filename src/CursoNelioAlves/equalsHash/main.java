package CursoNelioAlves.equalsHash;

public class main {
    public static void main(String[] args) {
        client c1 = new client("maria", "maria@gmial.com");
        client c2 = new client("alex", "alex@gmail.com");
        client c3 = new client("alex", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c2.equals(c3)); // so vai dar true se o email e nome for verdadeiro

    }
}
