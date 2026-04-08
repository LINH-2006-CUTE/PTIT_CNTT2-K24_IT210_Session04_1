package com.example.session04_1.bai5.controller;


import com.restaurant.bai5.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bai5/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public String getOrder(@PathVariable String id) {
        try {
            Long orderId = Long.parseLong(id);
            return orderService.getOrderDetail(orderId);
        } catch (NumberFormatException e) {
            return "Lỗi: ID đơn hàng phải là một số (Ví dụ: 123), không được nhập chữ '" + id + "'";
        }
    }

    @PostMapping
    public String createOrder() {
        return "Tạo đơn hàng thành công!";
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        return "Đã hủy đơn hàng số: " + id;
    }
}