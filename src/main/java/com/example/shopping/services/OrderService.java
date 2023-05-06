package com.example.shopping.services;

import com.example.shopping.models.Customer;
import com.example.shopping.models.Order;
import com.example.shopping.repositories.CustomerRepository;
import com.example.shopping.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CustomerRepository customerRepository;




    public Order saveOrder(Order order)
    {

        order.setOrder_date(new Date());

        return orderRepository.save(order);
    }

    // Read operation
    public List<Order> getAllOrders()
    {
        return (List<Order>)
                orderRepository.findAll();
    }
}
