package entities;

import java.util.Scanner;

public class comumProduct {
    private String name;
    protected Double price;

    public comumProduct(){

    }

    public comumProduct(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag(){
        return name + " $ " + price;
    }
}
