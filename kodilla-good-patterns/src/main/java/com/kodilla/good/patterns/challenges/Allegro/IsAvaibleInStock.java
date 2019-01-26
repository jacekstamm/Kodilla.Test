package com.kodilla.good.patterns.challenges.Allegro;

public class IsAvaibleInStock {

    public boolean avaibleInStock(Stock stock, Item item) {
        boolean isAvaible = stock.stockItemList().containsValue(item);
        return isAvaible;
    }
}
