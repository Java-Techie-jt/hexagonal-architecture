package com.javatechie.config;

import com.javatechie.domain.port.output.OrderRepositoryPort;
import com.javatechie.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

    @Bean
    public OrderService orderService(OrderRepositoryPort repository) {
        return new OrderService(repository);
    }
}
