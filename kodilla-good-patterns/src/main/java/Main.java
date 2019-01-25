import com.kodilla.good.patterns.challenges.Allegro.*;

public class Main {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        Stock stock = new Stock();
        stock.stockItemList();







    }
}
