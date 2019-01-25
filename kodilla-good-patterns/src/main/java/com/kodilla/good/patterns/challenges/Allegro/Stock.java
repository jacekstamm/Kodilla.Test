package com.kodilla.good.patterns.challenges.Allegro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Stock {

    public ArrayList<Item> itemList;

    public Stock() {
        itemList = new ArrayList<>();
    }

    public Map stockItemList() {

        ReferenceNumberRandom referenceNumberRandom = new ReferenceNumberRandom();


        Map<Long, Item> stockItemMap = new HashMap<>();
        stockItemMap.put(referenceNumberRandom.referenceNumberGenerator(), new Item("Apple", 1.98));
        stockItemMap.put(referenceNumberRandom.referenceNumberGenerator(), new Item("iPhone SE", 3999.98));
        stockItemMap.put(referenceNumberRandom.referenceNumberGenerator(), new Item("Pants", 219.99));
        stockItemMap.put(referenceNumberRandom.referenceNumberGenerator(), new Item("AirPods", 399.99));
        stockItemMap.put(referenceNumberRandom.referenceNumberGenerator(), new Item("Apple Watch", 1899.98));
        stockItemMap.put(referenceNumberRandom.referenceNumberGenerator(), new Item("Pencil", 0.97));
        stockItemMap.put(referenceNumberRandom.referenceNumberGenerator(), new Item("Coca-Cola", 3.19));
        stockItemMap.put(referenceNumberRandom.referenceNumberGenerator(), new Item("Pepsi", 3.29));

        System.out.println("Full Item List:");
        stockItemMap.entrySet().stream()
                .map(n -> " <> " + n + " <> ")
                .forEach(System.out::println);

        return stockItemMap;
    }
}
