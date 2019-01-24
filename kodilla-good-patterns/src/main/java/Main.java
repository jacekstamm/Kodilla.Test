import com.kodilla.good.patterns.challenges.Allegro.*;

public class Main {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        Stock apple = new Stock(new Item("Apple", "Fruits", 1.98), 0001);
        Stock pants = new Stock(new Item("Pants", "Clothes", 99.90), 0002);

        apple.stockListCreator();
        pants.stockListCreator();





    }
}
