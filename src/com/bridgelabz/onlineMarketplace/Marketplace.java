package com.bridgelabz.onlineMarketplace;

public class Marketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("The Great Gatsby", 20.0, new BookCategory("Fiction"));
        Product<ClothingCategory> clothing = new Product<>("T-Shirt", 15.0, new ClothingCategory("Casual"));
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 500.0, new GadgetCategory("Electronics"));

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(clothing);
        catalog.addProduct(gadget);

        System.out.println("Before Discount:");
        catalog.displayProducts();

        // Apply Discount using generic method
        ProductCatalog.applyDiscount(book, 10);
        ProductCatalog.applyDiscount(clothing, 5);
        ProductCatalog.applyDiscount(gadget, 15);

        System.out.println("\nAfter Discount:");
        catalog.displayProducts();
    }
}
