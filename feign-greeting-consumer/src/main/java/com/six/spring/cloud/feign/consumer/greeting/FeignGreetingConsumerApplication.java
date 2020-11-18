package com.six.spring.cloud.feign.consumer.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignGreetingConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignGreetingConsumerApplication.class, args);

    }
}
