package java_db;

public class Item {
    private int id;
    private Cart cart_id;
    private double total;
    private String item_id;
    private int quantity;

    public Item(int id, Cart car_id, double total, String item_id, int quantity) {
        this.id = id;
        this.cart_id = car_id;
        this.total = total;
        this.item_id = item_id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart_id() {
        return cart_id;
    }

    public void setCart_id(Cart cart_id) {
        this.cart_id = cart_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
