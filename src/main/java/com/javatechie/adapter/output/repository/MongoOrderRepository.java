package com.javatechie.adapter.output.repository;

import com.javatechie.domain.dto.FoodOrder;
import com.javatechie.domain.port.output.OrderRepositoryPort;

public class MongoOrderRepository implements OrderRepositoryPort {

    // inject mongo repository

    @Override
    public void saveOrder(FoodOrder order) {

    }

    @Override
    public String findById(String orderId) {
        return "";
    }
}
