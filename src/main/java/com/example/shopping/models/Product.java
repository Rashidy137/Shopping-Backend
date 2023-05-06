package com.example.shopping.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer product_id;
    private String product_name;
    private String product_desc;
    private double price;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    private Order order;

    @ManyToOne
    @JoinColumn(name="admin_id", nullable=false)
    private Admin admin;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;

}
