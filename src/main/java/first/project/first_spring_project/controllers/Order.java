package first.project.first_spring_project.controllers;

public class Order {

    private String orderName;
    private int price;
    private int orderId;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "orderName: " + orderName + ", price: " + price + ", orderId: " + orderId;
    }

}
