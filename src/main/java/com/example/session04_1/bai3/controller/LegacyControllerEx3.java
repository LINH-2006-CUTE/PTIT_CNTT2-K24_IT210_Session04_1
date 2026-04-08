package com.example.session04_1.bai3.controller;

import com.example.session04_1.bai1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LegacyControllerEx3 {

    private final OrderService orderService;

    @Autowired
    public LegacyControllerEx3(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/bai3/orders/{id}")
    @ResponseBody
    public String getOrderDetail(@PathVariable Long id) {
        return "chi tiet don hang so 5: " + id;
    }
}