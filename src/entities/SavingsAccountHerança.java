package entities;

public class SavingsAccountHerança  extends ContaHerança{
    private Double interestRate;

    public SavingsAccountHerança() {
        super();
    }

    public SavingsAccountHerança(Integer numero, String titular, Double saldo, Double interestRate) {
        super(numero, titular, saldo);
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

}
