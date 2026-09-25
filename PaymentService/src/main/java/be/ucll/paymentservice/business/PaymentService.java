package be.ucll.paymentservice.business;

import be.ucll.paymentservice.persistence.Payment;
import be.ucll.paymentservice.persistence.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    public Payment findById(Long id) {
        return paymentRepository.findById(id).orElseThrow(() -> new RuntimeException("Payment not found: " + id));
    }

    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }
}
