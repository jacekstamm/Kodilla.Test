package com.kodilla.good.patterns.challenges.Allegro;

import java.util.ArrayList;

public class IsAvailableInStock {

    private Stock stock = new Stock();
    private ArrayList stockList;

    public boolean avaibleInStock(Item item) {
        stockList = stock.stockItemList();
        if (stockList.contains(item)) {
            System.out.println("Available in Stock");
        } else {
            System.out.println("There is no: " + item);
        }
        return stockList.contains(item);
    }
}
