package com.bridgelabz.onlineMarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product<? extends Category> product : products) {
            System.out.println(product);
        }
    }

    // Generic method to apply discount dynamically
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }

