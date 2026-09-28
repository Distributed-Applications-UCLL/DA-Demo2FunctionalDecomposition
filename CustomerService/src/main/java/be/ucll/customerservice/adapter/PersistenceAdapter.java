package be.ucll.customerservice.adapter;

import be.ucll.customerservice.persistence.Customer;
import be.ucll.customerservice.persistence.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersistenceAdapter implements PersistenceAdapterInterface{

    private CustomerRepository customerRepository;

    @Autowired
    public PersistenceAdapter(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Customer not found: " + id));
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
