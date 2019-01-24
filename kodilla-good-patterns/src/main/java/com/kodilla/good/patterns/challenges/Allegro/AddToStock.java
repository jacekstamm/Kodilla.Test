package com.kodilla.good.patterns.challenges.Allegro;

import java.util.ArrayList;

public class AddToStock {

    Stock stock = new Stock();

    public ArrayList<Item> addToItemList(Item item) {
        stock.getItemList().add(item);
        return stock.getItemList();

    }
}
