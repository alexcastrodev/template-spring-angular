package com.example.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductsController {

    @GetMapping("/api/products")
    ArrayList all() {
        return new ArrayList();
    }
}
