package com.bridgelabz.smartWarehouse;

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Displaying items from each category
        System.out.println("Electronics:");
        WarehouseUtility.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtility.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtility.displayItems(furnitureStorage.getItems());
    }
}

