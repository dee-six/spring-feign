package com.six.spring.cloud.feign.consumer.greeting.service;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

@Component
public class GreetingRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("user", "Deepak");
        requestTemplate.header("pass", "DeepakPass");
    }
}
