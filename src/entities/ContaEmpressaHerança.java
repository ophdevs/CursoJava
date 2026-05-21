package entities;

public class ContaEmpressaHerança extends ContaHerança {
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
            depositoConta(valor);
        }
    }
}
