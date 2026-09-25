package be.ucll.deliveryservice.business;

import be.ucll.deliveryservice.persistence.Delivery;
import be.ucll.deliveryservice.persistence.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    private final DeliveryRepository deliveryRepository;

    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }

    public Delivery findById(Long id) {
        return deliveryRepository.findById(id).orElseThrow(() -> new RuntimeException("Delivery not found: " + id));
    }

    public Delivery save(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }
}
