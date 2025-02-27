package io.ms.server.ms_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MSServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MSServerApplication.class, args);
    }

}
