package entities;

public class Company  extends TaxPayer{
    private Integer numberOfEmployees;

    public Company(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company(String name, Double anuallncome, Integer numberOfEmployees) {
        super(name, anuallncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees > 10){
            return anuallncome * 0.14;
        } else {
            return anuallncome * 0.16;
        }
    }
}
