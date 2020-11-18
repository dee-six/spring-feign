package com.six.spring.cloud.feign.consumer.greeting.api;


import com.six.spring.cloud.feign.greeting.api.GreetingApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "feign-greeting-consumer", url = "${producer.url}")
public interface GreetingClientApi extends GreetingApi {

}
