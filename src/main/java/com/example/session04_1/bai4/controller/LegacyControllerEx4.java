package com.example.session04_1.bai4.controller;

import com.example.session04_1.bai1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LegacyControllerEx4 {

    private final OrderService orderService;

    @Autowired
    public LegacyControllerEx4(OrderService orderService) {
        this.orderService = orderService;
    }

    // bai4
    @GetMapping("/bai4/products")
    public String getProductList(
            @RequestParam(value = "category", required = false, defaultValue = "all") String category,
            @RequestParam(value = "limit", required = false, defaultValue = "6666") Integer limit,
            ModelMap model
    ) {
        model.addAttribute("category", category)
                .addAttribute("limit", limit)
                .addAttribute("message", "Tìm kiếm thành công");

        return "productList";
    }
}