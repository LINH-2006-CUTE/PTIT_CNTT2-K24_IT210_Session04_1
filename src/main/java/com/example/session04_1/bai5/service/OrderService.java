package com.example.session04_1.bai5.service;

import com.example.session04_1.bai5.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getOrderDetail(Long id) {
        return orderRepository.findById(id);
    }
}