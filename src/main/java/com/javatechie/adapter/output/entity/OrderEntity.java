package com.javatechie.adapter.output.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class OrderEntity {

    @Id
    private String orderId;

    private String customerName;
    private String restaurantName;
    private String item;
    private String status;

    // Getters & Setters
}
