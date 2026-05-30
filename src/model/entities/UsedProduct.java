package model.entities;

import java.time.LocalDate;

public class UsedProduct extends comumProduct {
    protected LocalDate manufactureDate;

    public UsedProduct(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + "(Used) $ " + price + "(ManuFacture date: $ " + manufactureDate + " )";
    }
}
