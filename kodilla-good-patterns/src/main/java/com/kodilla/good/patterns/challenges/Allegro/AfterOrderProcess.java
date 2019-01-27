package com.kodilla.good.patterns.challenges.Allegro;

public class AfterOrderProcess {

    public void deleteFromStock(Item item) {
        Stock stock = new Stock();
        stock.stockItemList().remove(item);
    }
}
