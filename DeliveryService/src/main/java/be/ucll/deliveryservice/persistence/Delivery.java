package be.ucll.deliveryservice.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "delivery")
public class Delivery {
    @Id
    private Long id;
    private Long orderId;
    private String address;
    private String status;

    public Delivery() {
    }

    public Delivery(Long id, Long orderId, String address, String status) {
        this.id = id;
        this.orderId = orderId;
        this.address = address;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long order) {
        this.orderId = order;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
