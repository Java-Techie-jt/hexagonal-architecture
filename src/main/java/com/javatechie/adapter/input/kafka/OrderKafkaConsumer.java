package com.javatechie.adapter.input.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.domain.dto.FoodOrder;
import com.javatechie.domain.port.input.PlaceOrderUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderKafkaConsumer {

    @Autowired
    private PlaceOrderUsecase placeOrderUseCase;

    //@KafkaListener(topics = "food-order-topic", groupId = "order-group")
    public void consume(String message) throws JsonProcessingException {
        // Assuming the message is a JSON string representing a FoodOrder
        // You would typically use a library like Jackson to convert it to a FoodOrder object
        // For simplicity, let's assume the message is directly convertible
        ObjectMapper mapper = new ObjectMapper();
        FoodOrder order = mapper.readValue(message, FoodOrder.class);
        placeOrderUseCase.placeOrder(order);
        System.out.println("Order placed via Kafka");

    }

}
