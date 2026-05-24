package entities;

public class SavingsAccountHerança  extends ContaBanco{
    private Double interestRate;

    public SavingsAccountHerança() {
        super( );

    }

    public SavingsAccountHerança(int numeroConta, String nome, double saldo, Double interestRate) {
        super(numeroConta, nome, saldo);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance (){
        saldo += saldo * interestRate;
    }

    @Override
    public void Saque (double valorSaque){
        saldo -= valorSaque;
    }

}
