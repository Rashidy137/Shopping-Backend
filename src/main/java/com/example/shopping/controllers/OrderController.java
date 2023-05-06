package com.example.shopping.controllers;

import com.example.shopping.models.Customer;
import com.example.shopping.models.Order;
import com.example.shopping.services.CustomerService;
import com.example.shopping.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    // Save operation
    @PostMapping("/addOrder")
    public Order saveOrder(@RequestBody Order order)
    {

        return orderService.saveOrder(order);
    }
    @GetMapping("/getAllOrders")
    public List<Order> getAll() {
        return orderService.getAllOrders();
    }
}
