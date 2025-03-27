package com.bridgelabz.smartWarehouse;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends  WareHouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T retrieveItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    public List<T> getItems() {
        return items;
    }
}
