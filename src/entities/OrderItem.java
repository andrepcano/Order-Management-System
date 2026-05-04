package entities;

public class OrderItem {
    private int quantity;
    private double price;

    public OrderItem() {
    }

    public OrderItem(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public double getSubTotal() {
        return quantity * price;
    }

}
