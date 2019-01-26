import com.kodilla.good.patterns.challenges.Allegro.*;

public class Main {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new OrderItemsService(), new OrderItemsRepository());
        productOrderService.process(orderRequest);

        System.out.println(orderRequest);







    }
}
