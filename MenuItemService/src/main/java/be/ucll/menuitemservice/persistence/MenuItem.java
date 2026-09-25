package be.ucll.menuitemservice.persistence;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "menu_item")
public class MenuItem {
    @Id
    private Long id;
    private String name;
    private BigDecimal price;
    private Long restaurantId;

    public MenuItem() {
    }

    public MenuItem(Long id, String name, BigDecimal price, Long restaurantId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.restaurantId = restaurantId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getRestaurant() {
        return restaurantId;
    }

    public void setRestaurant(Long restaurant) {
        this.restaurantId = restaurant;
    }
}
