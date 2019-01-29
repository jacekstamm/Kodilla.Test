package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;

public class GlutenFreeShop{

    private ArrayList<Product> glutenFreeShopProductList = new ArrayList<>();

    public GlutenFreeShop() {
        productListGFS();
    }

    public ArrayList<Product> productListGFS() {
        glutenFreeShopProductList.add(0, new Product("Bułki królewskie", 87));
        glutenFreeShopProductList.add(1, new Product("Chleb z nasionami chia", 57));
        glutenFreeShopProductList.add(2, new Product("Chleb ciemny GF", 12));

        return glutenFreeShopProductList;
    }
}
