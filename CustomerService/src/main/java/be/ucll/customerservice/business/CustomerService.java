package be.ucll.customerservice.business;


import be.ucll.customerservice.persistence.Customer;
import be.ucll.customerservice.persistence.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    //@Autowired
    public CustomerService(CustomerRepository customerRepository) {
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
