import entities.ContaEmpressaHerança;
import entities.ContaHerança;

public class Herançateste {
    public static void main(String[] args) {
        ContaHerança acc = new ContaHerança(1001, "pedro", 500.0);
        ContaEmpressaHerança ecc = new ContaEmpressaHerança(1002, "antonio", 0.0, 6000.0);

        //UPCASTING

        ContaHerança acc1 = ecc;
        ContaHerança acc2 = new ContaEmpressaHerança(1003,"carvalho", 100.0, 5400.0);

        // DOWNCASTING

        ContaEmpressaHerança ecc1 = (ContaEmpressaHerança) acc1;
        ecc1.Emprestimo(300.0);

        System.out.println(ecc1.getSaldo());


    }
}
