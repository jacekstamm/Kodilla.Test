package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Shop {

    private String producerName = "Healthy Shop";
    private List<Product> healthyShopProductList = new ArrayList<>();

    public List<Product> productListHS() {
        healthyShopProductList.add(0, new Product("Spirulina", 257));
        healthyShopProductList.add(1, new Product("Olej kokosowy", 25));
        healthyShopProductList.add(2, new Product("Makaron gryczany", 68));

        return healthyShopProductList;
    }

    public String getProducerName() {
        return producerName;
    }

    public List<Product> getHealthyShopProductList() {
        return healthyShopProductList;
    }

    @Override
    public void process() {

    }
}
