package java_db;

public class Item {
    private int id;
    private Cart cart_id;
    private double item_total;
    private String item_id;
    private int quantity;

    public Item(int id, Cart cart_id, double item_total, String item_id, int quantity) {
        this.id = id;
        this.cart_id = cart_id;
        this.item_total = item_total;
        this.item_id = item_id;
        this.quantity = quantity;
    }

    public Item() {

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

    public double getItem_total() {
        return item_total;
    }

    public void setItem_total(double item_total) {
        this.item_total = item_total;
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
