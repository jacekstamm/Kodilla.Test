package com.kodilla.good.patterns.challenges.Allegro;

import java.util.ArrayList;

public class Stock {

    public Stock() {
        stockItemList();
    }

    public ArrayList<Item> stockItemList() {

        ArrayList<Item> stockItemMap = new ArrayList<>();
        stockItemMap.add(new Item("Apple", 1.98));
        stockItemMap.add( new Item("iPhone SE", 3999.98));
        stockItemMap.add(new Item("Pants", 219.99));
        stockItemMap.add(new Item("AirPods", 399.99));
        stockItemMap.add(new Item("Apple Watch", 1899.98));
        stockItemMap.add(new Item("Pencil", 0.97));
        stockItemMap.add(new Item("Coca-Cola", 3.19));
        stockItemMap.add(new Item("Pepsi", 3.29));
        stockItemMap.add(new Item("Snowboard", 799.99));

        return stockItemMap;
    }
}
