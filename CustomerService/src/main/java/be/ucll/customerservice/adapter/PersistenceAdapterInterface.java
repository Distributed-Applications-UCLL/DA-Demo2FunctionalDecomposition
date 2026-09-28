package be.ucll.customerservice.adapter;

import be.ucll.customerservice.persistence.Customer;

import java.util.List;

public interface PersistenceAdapterInterface {

    public List<Customer> findAll();
    public Customer findById(Long id);
    public Customer save(Customer customer);
}
