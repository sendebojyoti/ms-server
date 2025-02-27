package io.ms.server.ms_server.controller;

import io.ms.server.ms_server.service.ProductsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@Slf4j
@AllArgsConstructor
public class ProductsController {

    public ProductsService productsService;

    @GetMapping
    public List<String> getProducts() {
        return productsService.getProducts();
    }

    @GetMapping("/fallbackProducts")
    public List<String> getFallbackProducts() {
        log.error("Inside ProductsController.getFallbackProducts");
        return productsService.getFallbackProducts();
    }

}
