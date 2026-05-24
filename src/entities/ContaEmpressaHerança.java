package entities;

public class ContaEmpressaHerança extends ContaBanco {
    private Double limiteEmprestimo;

    public ContaEmpressaHerança(){
        super();
    }

    public ContaEmpressaHerança(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void Emprestimo(Double valor){
        if (valor <= limiteEmprestimo){
            Deposito(valor);
        }
    }

    @Override
    public void Saque (double valorSaque){ // usando o super para valores extras
        super.Saque(valorSaque);
        saldo -= 3.0;
    }
}
