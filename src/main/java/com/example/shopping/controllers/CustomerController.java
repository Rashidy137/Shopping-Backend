package com.example.shopping.controllers;


import com.example.shopping.models.Customer;
import com.example.shopping.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    // Save operation
    @PostMapping("/addCustomer")
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        return customerService.saveCustomer(customer);
    }
    @GetMapping("/findCustomer")
    public Optional<Customer> getAll(@RequestParam Integer id) {
        return customerService.findCustomer(id);
    }
    @GetMapping("/getAllCustomers")
    public List<Customer> getAll() {
        return customerService.getAllCustomers();
    }

}
