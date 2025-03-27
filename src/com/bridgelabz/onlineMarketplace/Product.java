package com.bridgelabz.onlineMarketplace;

public class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price + ", Category: " + category.getClass().getSimpleName();
    }

