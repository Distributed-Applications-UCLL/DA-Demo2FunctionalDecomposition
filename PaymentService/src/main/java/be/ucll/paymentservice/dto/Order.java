package be.ucll.paymentservice.dto;

import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    @Id
    private Long id;
    private Long customerId;
    private Long restaurantId;
    private String status;
    private BigDecimal total;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Long id, Long customerId, Long restaurantId, String status, BigDecimal total) {
        this.id = id;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.status = status;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomer() {
        return customerId;
    }

    public void setCustomer(Long customer) {
        this.customerId = customer;
    }

    public Long getRestaurant() {
        return restaurantId;
    }

    public void setRestaurant(Long restaurant) {
        this.restaurantId = restaurant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items=items;
    }

}
