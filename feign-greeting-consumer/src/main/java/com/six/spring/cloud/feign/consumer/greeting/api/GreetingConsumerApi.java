package com.six.spring.cloud.feign.consumer.greeting.api;

import com.six.spring.cloud.feign.greeting.dto.GreetingDto;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingConsumerApi {

    @Autowired
    GreetingClientApi greetingClientApi;

    @RequestMapping(method = RequestMethod.GET, path = "/greet")
    public GreetingDto getGreeting() {
        return greetingClientApi.getGreeting("System User");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/greet/{who}")
    public GreetingDto getGreeting(@PathVariable("who") String who) {
        return greetingClientApi.getGreeting(who);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/monitor")
    public String getMonitorData() {
        return greetingClientApi.getRequestHeader();
    }
}
