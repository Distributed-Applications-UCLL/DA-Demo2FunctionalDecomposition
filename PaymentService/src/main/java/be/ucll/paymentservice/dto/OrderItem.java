package be.ucll.paymentservice.dto;

public class OrderItem {
    private Long id;
    private Long menuItemId;
    private int quantity;

    public OrderItem() {
    }

    public OrderItem(Long id, Long menuItemId, int quantity) {
        this.id = id;
        this.menuItemId = menuItemId;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMenuItem() {
        return menuItemId;
    }

    public void setMenuItem(Long menuItemId) {
        this.menuItemId = menuItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
