package be.ucll.deliveryservice.api;

import be.ucll.deliveryservice.business.DeliveryService;
import be.ucll.deliveryservice.persistence.Delivery;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {
    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping
    public List<Delivery> findAll() {
        return deliveryService.findAll();
    }

    @GetMapping("/{id}")
    public Delivery findById(@PathVariable Long id) {
        return deliveryService.findById(id);
    }

    @PostMapping
    public Delivery create(@RequestBody Delivery delivery) {
        return deliveryService.save(delivery);
    }
}
