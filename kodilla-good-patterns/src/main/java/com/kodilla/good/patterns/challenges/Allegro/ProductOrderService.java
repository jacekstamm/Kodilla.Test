package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private Stock stock = new Stock();
    private AfterOrderProcess afterOrderProcess = new AfterOrderProcess();

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        IsAvailableInStock isAvailableInStock = new IsAvailableInStock();
        boolean isOrdered = isAvailableInStock.avaibleInStock(orderRequest.getItem());

        if (isOrdered) {
            System.out.println("Stock size: " + stock.stockItemList().size());
            orderRepository.create(orderRequest.getItem(), orderRequest.getUser());
            informationService.inform(orderRequest.getUser(), orderRequest.getItem());
            orderService.order(orderRequest.getItem(), orderRequest.getUser());
            afterOrderProcess.deleteFromStock(orderRequest.getItem());
            System.out.println("Stock size after: " + stock.stockItemList().size());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
