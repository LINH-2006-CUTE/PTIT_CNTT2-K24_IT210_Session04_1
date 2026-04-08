package com.example.session04_1.bai2.controller;

import com.example.session04_1.bai1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LegacyControllerEx2 {

    private final OrderService orderService;

    @Autowired
    public LegacyControllerEx2(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/bai2/menu")
    @ResponseBody
    public String getMenu(
            @RequestParam(value = "category", required = false, defaultValue = "chay") String category
    ) {
        return "Thực đơn: " + category;
    }
}