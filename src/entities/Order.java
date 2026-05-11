package entities;

import entities.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer ID;
    private Date Momento;
    private OrderStatus Status;

    public Order (){

    }

    public Order(Integer ID, Date momento, OrderStatus status) {
        this.ID = ID;
        this.Momento = momento;
        this.Status = status;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getMomento() {
        return Momento;
    }

    public void setMomento(Date momento) {
        Momento = momento;
    }

    public OrderStatus getStatus() {
        return Status;
    }

    public void setStatus(OrderStatus status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", Momento=" + Momento +
                ", Status=" + Status +
                '}';
    }
}
