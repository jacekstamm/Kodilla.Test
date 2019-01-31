package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Shop {

    private ExtraFoodStock extraFoodStock = new ExtraFoodStock();
    private int index;
    public int differenceQuantity;

    @Override
    public boolean process(Product product) {
        boolean isOrNot = false;
        for (int x = 0; x < extraFoodStock.stockEF().size(); x++) {
            if (extraFoodStock.stockEF().get(x).getProductName().equals(product.getProductName())){
                isOrNot = true;
                index = x;
                break;
            }
        }
        if (isOrNot && extraFoodStock.stockEF().get(index).getQuantity() >= product.getQuantity()) {
            differenceQuantity = extraFoodStock.stockEF().get(index).getQuantity() - product.getQuantity();
            String productName = extraFoodStock.stockEF().get(index).getProductName();
            extraFoodStock.stockEF().remove(index);
            extraFoodStock.stockEF().add(index, new Product(productName, differenceQuantity));
            System.out.println("Order is accepted.");
            return true;
        } else {
            System.out.println("Order false.");
            return false;
        }
    }
}