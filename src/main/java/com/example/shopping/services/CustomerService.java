package com.example.shopping.services;

import com.example.shopping.models.Customer;
import com.example.shopping.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    public Customer saveCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }
    public Optional<Customer> findCustomer(Integer id)
    {
        return customerRepository.findById(id);

    }
    // Read operation
     public List<Customer> getAllCustomers()
    {
        return (List<Customer>)
                customerRepository.findAll();
    }
}
