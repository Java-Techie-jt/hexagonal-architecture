package com.javatechie.adapter.output;

import com.javatechie.adapter.output.entity.OrderEntity;
import com.javatechie.adapter.output.repository.SpringDataOrderRepository;
import com.javatechie.domain.dto.FoodOrder;
import com.javatechie.domain.port.output.OrderRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JpaOrderRepository implements OrderRepositoryPort {

    @Autowired
    private SpringDataOrderRepository repository;

    @Override
    public void saveOrder(FoodOrder order) {
        System.out.println("--OUTPUT ADAPTER EXECUTED WITH OUTPUT PORT--");
        repository.save(mapToEntity(order));
    }

    @Override
    public String findById(String orderId) {
        OrderEntity entity = repository.findById(orderId).orElseThrow();
        System.out.println("--OUTPUT ADAPTER EXECUTED WITH OUTPUT PORT--");
        return mapToDomain(entity).getStatus();
    }

    private OrderEntity mapToEntity(FoodOrder order) {
        OrderEntity entity = new OrderEntity();
        entity.setOrderId(order.getOrderId());
        entity.setCustomerName(order.getCustomerName());
        entity.setRestaurantName(order.getRestaurantName());
        entity.setItem(order.getItem());
        entity.setStatus(order.getStatus());
        return entity;
    }

    private FoodOrder mapToDomain(OrderEntity entity) {
        FoodOrder order = new FoodOrder();
        order.setOrderId(entity.getOrderId());
        order.setCustomerName(entity.getCustomerName());
        order.setRestaurantName(entity.getRestaurantName());
        order.setItem(entity.getItem());
        order.setStatus(entity.getStatus());
        return order;
    }
}
