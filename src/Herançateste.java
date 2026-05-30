import model.entities.ContaBanco;
import model.entities.ContaEmpressaHerança;
import model.entities.SavingsAccountHerança;

public class Herançateste {
    public static void main(String[] args) {
        ContaBanco acc1 = new ContaBanco(1001,"gabriel", 200.0);
        acc1.Saque(150);
        System.out.println(acc1.getSaldo());

        ContaBanco acc2 = new SavingsAccountHerança(1003, "fabio", 200.0, 0.01 );
        acc2.Saque(150);
        System.out.println(acc2.getSaldo());

        ContaBanco acc3 = new ContaEmpressaHerança(1004, "joao", 200.0, 400.0);
        acc3.Saque(150);
        System.out.println(acc3.getSaldo());
    }
}
