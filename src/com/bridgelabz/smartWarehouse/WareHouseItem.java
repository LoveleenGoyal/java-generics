package com.bridgelabz.smartWarehouse;

public abstract class WareHouseItem {
    private String itemName;

    public WareHouseItem(String itemName) {
        this.itemName = itemName;
    }

    public String getName() {
        return itemName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + itemName;
    }
}

class Electronics extends WareHouseItem {
    public Electronics(String name) {
        super(name);
    }
}

class Groceries extends WareHouseItem {
    public Groceries(String name) {
        super(name);
    }
}

class Furniture extends WareHouseItem {
    public Furniture(String name) {
        super(name);
    }
}