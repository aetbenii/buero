package java_db;

import java.util.Set;

public class Cart {

    private int cart_id;
    private double total;
    private String name;
    private Set<Item> Itemset;

    public Cart(int cart_id, double total, String name, Set<Item> itemset) {
        this.cart_id = cart_id;
        this.total = total;
        this.name = name;
        Itemset = itemset;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItemset() {
        return Itemset;
    }

    public void setItemset(Set<Item> itemset) {
        Itemset = itemset;
    }
}
