package com.example.session04_1.bai3.repository;

import org.springframework.stereotype.Repository;

@Repository("orderRepositoryBai3")
public class OrderRepository {
    public String getAllOrders() {
        return "Danh sach don hang";
    }

    public String getOrderById(Long id) {
        return "Thong tin don hang: " + id;
    }
}
