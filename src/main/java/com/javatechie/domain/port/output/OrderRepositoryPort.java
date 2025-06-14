package com.javatechie.domain.port.output;

import com.javatechie.domain.dto.FoodOrder;

public interface OrderRepositoryPort {

    void saveOrder(FoodOrder order);
    String findById(String orderId);
}
