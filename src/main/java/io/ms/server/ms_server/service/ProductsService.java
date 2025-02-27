package io.ms.server.ms_server.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductsService {

    public List<String> getProducts() {

        log.info("Inside ProductsService.getProducts");
        return List.of("Prod-1", "Prod-2", "Prod-3", "Prod-4", "Prod-5");
    }

    @CircuitBreaker(name = "productFallbackService", fallbackMethod = "listFallBackProducts")
    public List<String> getFallbackProducts() {
        log.error("Inside ProductsService.getFallbackProducts");
        throw new RuntimeException("Exception inside fallBackProducts Controller");
    }

    public List<String> listFallBackProducts(Throwable throwable) {
        log.info("Inside ProductsService.listFallBackProducts");
        return List.of("F-Prod-1", "F-Prod-2", "F-Prod-3", "F-Prod-4", "F-Prod-5");

    }

}
