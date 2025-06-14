package com.javatechie.adapter.output.repository;

import com.javatechie.adapter.output.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataOrderRepository extends JpaRepository<OrderEntity, String> {
}
