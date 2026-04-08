package com.example.session04_1.bai4.repository;


import org.springframework.stereotype.Repository;

@Repository("orderRepositoryBai4")
public class OrderRepository {
    public String getAllOrders() {
        return "Danh sach don hang";
    }

    public String getOrderById(Long id) {
        return "Thong tin don hang voi ID: " + id;
    }
}
