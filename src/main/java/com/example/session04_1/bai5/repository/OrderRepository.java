package com.example.session04_1.bai5.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public String findById(Long id) {
        return "đơn hàng số: " + id;
    }
}