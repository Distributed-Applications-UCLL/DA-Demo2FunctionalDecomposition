package be.ucll.orderservice.business;
import be.ucll.orderservice.persistence.Order;
import be.ucll.orderservice.persistence.OrderItem;
import be.ucll.orderservice.persistence.OrderRepository;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
   // private final MenuItemRepository menuItemRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

  /*  public OrderService(OrderRepository orderRepository,
                        MenuItemRepository menuItemRepository) {
        this.orderRepository = orderRepository;
        this.menuItemRepository = menuItemRepository;
    } */

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found: " + id));
    }

    public Order save(Order order) {
        BigDecimal total = new BigDecimal("12.34");
        order.setTotal(total);
        return orderRepository.save(order);
    }

    /*public Order save(Order order) {

        BigDecimal total = BigDecimal.ZERO;

        for (OrderItem item : order.getItems()) {

            MenuItem menuItem = menuItemRepository
                    .findById(item.getMenuItem().getId())
                    .orElseThrow(() ->
                            new RuntimeException(
                                    "Menu item not found: "
                                            + item.getMenuItem().getId()));

            item.setMenuItem(menuItem);
            item.setOrder(order);

            BigDecimal itemTotal = menuItem.getPrice()
                    .multiply(BigDecimal.valueOf(item.getQuantity()));

            total = total.add(itemTotal);
        }

        order.setTotal(total);

        return orderRepository.save(order);
    } */
}
