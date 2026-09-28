package be.ucll.customerservice.business;


import be.ucll.customerservice.adapter.PersistenceAdapterInterface;
import be.ucll.customerservice.persistence.Customer;
import be.ucll.customerservice.persistence.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServiceInterface{

    private final PersistenceAdapterInterface pai;

    //@Autowired
    public CustomerService(PersistenceAdapterInterface pai) {
        this.pai = pai;
    }

    public List<Customer> findAll() {
        return pai.findAll();
    }

    public Customer findById(Long id) {
        return pai.findById(id);

    }

    public Customer save(Customer customer) {
        return pai.save(customer);
    }
}
