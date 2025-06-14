package com.javatechie.domain.port.input;

import com.javatechie.domain.dto.FoodOrder;

public interface PlaceOrderUsecase {

    void placeOrder(FoodOrder order);
}
