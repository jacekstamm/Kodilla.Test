package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class Food2DoorProducerMap {

    private Map<String, Shop> f2DProducerMap = new HashMap<>();

    public Map<String, Shop> producerMap() {
        f2DProducerMap.put("Gluten Free Shop", new GlutenFreeShop());
        f2DProducerMap.put("Extra Food Shop", new ExtraFoodShop());
        f2DProducerMap.put("Healthy Shop", new HealthyShop());

        return f2DProducerMap;
    }
}
