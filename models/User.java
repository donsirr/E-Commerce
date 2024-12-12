package models;

import java.util.ArrayList; // Import ArrayList
import java.util.HashMap;
import java.util.List; // Import List
import java.util.Map;

public class User {
    private String username;
    private String password;
    private String name;
    private String contactDetails;
    private String address;
    private Wallet wallet;
    private List<Order> orders;
    private Map<Product, Integer> cart = new HashMap<>();

    public User(String username, String password, String name, 
                String contactDetails, String address) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.contactDetails = contactDetails;
        this.address = address;
        this.wallet = new Wallet();
        this.orders = new ArrayList<>();
    }

    public void addToCart(Product product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public Map<Product, Integer> getCart() {
        return new HashMap<>(cart);
    }

    public void clearCart() {
        cart.clear();
    }
    
    // Password validation
    public boolean isValidPassword() {
        return password.length() >= 8;
    }

    // Add Order
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    // Getters
    public String getUsername() { return username; }
    public String getName() { return name; }
    public String getContactDetails() { return contactDetails; }
    public String getAddress() { return address; }
    public Wallet getWallet() { return wallet; }
    public List<Order> getOrders() { return orders; }
}