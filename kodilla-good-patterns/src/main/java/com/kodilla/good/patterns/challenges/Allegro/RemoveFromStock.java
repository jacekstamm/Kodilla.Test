package com.kodilla.good.patterns.challenges.Allegro;

import java.util.ArrayList;

public class RemoveFromStock {

    Stock stock = new Stock();

    public ArrayList<Item> removefromItemList(Item item) {
        stock.getItemList().remove(item);
        return stock.getItemList();

    }
}
