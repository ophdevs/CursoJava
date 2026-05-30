package model.entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public Individual(String name, Double anuallncome, Double healthExpenditures) {
        super(name, anuallncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override

    public Double tax(){
        if (anuallncome < 20000.00){
            return anuallncome * 0.15 - healthExpenditures * 0.5;
        } else {
            return anuallncome * 0.25 - healthExpenditures * 0.5;
        }
    }
}
