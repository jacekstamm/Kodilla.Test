package com.kodilla.good.patterns.challenges.Allegro;

import java.util.ArrayList;

public class Stock {

    private final ArrayList<Item> itemList;


    public Stock() {
        System.out.println("New Shop for Items created.");
        itemList = new ArrayList<>();
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }
}
