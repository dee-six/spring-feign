
package com.six.spring.cloud.feign.greeting.api;

import com.six.spring.cloud.feign.greeting.dto.GreetingDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface GreetingApi {

    @RequestMapping(method = RequestMethod.GET, path = "/greeting/{who}", produces = "application/json")
    GreetingDto getGreeting(@PathVariable String who);

    @RequestMapping(method = RequestMethod.GET, path = "/monitor", produces = "application/json")
    String getRequestHeader();
}
