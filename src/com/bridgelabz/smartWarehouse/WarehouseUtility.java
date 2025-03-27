package com.bridgelabz.smartWarehouse;

import java.util.List;

public class WarehouseUtility {
    public static void displayItems(List<? extends WareHouseItem> items) {
        for (WareHouseItem item : items) {
            System.out.println(item);
        }
    }


