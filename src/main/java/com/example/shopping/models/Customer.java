package com.example.shopping.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer customer_id;
    private String customer_name;
    private Integer age;
    private String phone_number;
    private String address;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Payment> payments;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;

    public Customer(String customer_name, Integer age, String phone_number, String address) {
        this.customer_name = customer_name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
    }
}
