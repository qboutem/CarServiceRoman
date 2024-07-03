package com.hromenko.carserviceroman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CarServiceRomanApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarServiceRomanApplication.class, args);
    }

}
