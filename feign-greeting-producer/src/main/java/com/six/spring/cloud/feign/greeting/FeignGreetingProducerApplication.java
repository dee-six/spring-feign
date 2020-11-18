package com.six.spring.cloud.feign.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeignGreetingProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignGreetingProducerApplication.class, args);
    }
}
