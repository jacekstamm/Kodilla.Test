package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Shop {

    private GlutenFreeStock glutenFreeStock = new GlutenFreeStock();
    private int index;
    public int differenceQuantity;

    @Override
    public boolean process(Product product) {
        boolean isOrNot = false;
        for (int x = 0; x < glutenFreeStock.stockGF().size(); x++) {
            if (glutenFreeStock.stockGF().get(x).getProductName().equals(product.getProductName())){
                isOrNot = true;
                index = x;
                break;
            }
        }
        if (isOrNot && glutenFreeStock.stockGF().get(index).getQuantity() >= product.getQuantity()) {
            differenceQuantity = glutenFreeStock.stockGF().get(index).getQuantity() - product.getQuantity();
            String productName = glutenFreeStock.stockGF().get(index).getProductName();
            glutenFreeStock.stockGF().remove(index);
            glutenFreeStock.stockGF().add(index, new Product(productName, differenceQuantity));
            System.out.println("Order is accepted.");
            return true;
        } else {
            System.out.println("Order false.");
            return false;
        }
    }
}
