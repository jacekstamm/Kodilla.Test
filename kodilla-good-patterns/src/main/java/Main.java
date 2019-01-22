import com.kodilla.good.patterns.challenges.Allegro.OrderRequest;
import com.kodilla.good.patterns.challenges.Allegro.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.Allegro.ProductOrderService;

public class Main {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.process(orderRequest);
    }
}
