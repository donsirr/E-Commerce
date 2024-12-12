package models;

import enums.ProductCategory;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private ProductCategory category;
    private String location;

    public Product(String name, double price, int quantity, 
                   ProductCategory category, String location) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.location = location;
    }

    public boolean isAvailable() {
        return quantity > 0;
    }

    public void reduceQuantity(int amount) {
        // This method does nothing by default
    }
    
    public boolean tryReduceQuantity(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            return true;
        }
        return false;
    }

    // New method to restore quantity
    public void restoreQuantity(int amount) {
        quantity += amount;
    }

    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public ProductCategory getCategory() { return category; }
    public String getLocation() { return location; }
}