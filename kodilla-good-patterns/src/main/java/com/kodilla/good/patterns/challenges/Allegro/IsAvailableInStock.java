package com.kodilla.good.patterns.challenges.Allegro;

import java.util.Map;

public class IsAvailableInStock {

    private Stock stock = new Stock();
    private Map stockList;

    public boolean avaibleInStock(Item item) {
        stockList = stock.stockItemList();
        if (stockList.containsValue(item)) {
            System.out.println("Available in Stock");
        } else {
            System.out.println("There is no: " + item);
        }
        return stockList.containsValue(item);
    }
}
