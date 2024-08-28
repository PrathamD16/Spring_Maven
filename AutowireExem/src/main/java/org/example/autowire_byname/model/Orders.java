package org.example.autowire_byname.model;

public class Orders {
    private int orderId;
    private String orderDetails;
    private int qty;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public int getQty() {
        return qty;
    }


    public void setQty(int qty) {
        this.qty = qty;


    }
    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDetails='" + orderDetails + '\'' +
                ", qty=" + qty +
                '}';
    }
}
