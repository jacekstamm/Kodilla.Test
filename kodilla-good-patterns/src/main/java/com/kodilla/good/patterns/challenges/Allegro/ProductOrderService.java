package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        IsAvailableInStock isAvailableInStock = new IsAvailableInStock();
        boolean isOrdered = isAvailableInStock.avaibleInStock(orderRequest.getItem());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getItem());
            orderRepository.create(orderRequest.getItem(), orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
