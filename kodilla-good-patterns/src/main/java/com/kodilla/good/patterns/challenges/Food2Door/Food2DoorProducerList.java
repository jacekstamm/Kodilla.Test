package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;

public class Food2DoorProducerList {

    public HashMap<String, Shop> getF2DProducerList() {
        HashMap<String, Shop> producerList = new HashMap<>();
        producerList.put("EXTRA FOOD SHOP", new ExtraFoodShop());
        producerList.put("GLUTEN FREE SHOP", new GlutenFreeShop());
        producerList.put("HEALTHY SHOP", new HealthyShop());

        return producerList;
    }
}
