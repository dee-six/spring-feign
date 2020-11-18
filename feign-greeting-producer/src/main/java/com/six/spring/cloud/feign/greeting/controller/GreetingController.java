package com.six.spring.cloud.feign.greeting.controller;

import com.six.spring.cloud.feign.greeting.api.GreetingApi;
import com.six.spring.cloud.feign.greeting.dto.GreetingDto;
import com.six.spring.cloud.feign.greeting.dto.RequestHeaderDto;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingController implements GreetingApi {

    @Autowired
    HttpServletRequest httpServletRequest;


    @Override
    public GreetingDto getGreeting(String who) {

        log.debug("Requested landed at the consumer !");
        return GreetingDto.builder().who(who).message("Welcome to the World of Feign").build();
    }

    @Override
    public String getRequestHeader() {

        log.debug(" Reading Header List !");
        List<RequestHeaderDto> headersList = new ArrayList<>();

        Enumeration headerNames = httpServletRequest.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String element = (String) headerNames.nextElement();
            headersList.add(
                RequestHeaderDto.builder().name(element).value(httpServletRequest.getHeader(element)).build());

            log.debug(element + ": " + httpServletRequest.getHeader(element));
        }
        log.debug(" Complete Header List ! {}", headersList.size());

        return (String) headersList.stream()
            .map(requestHeaderDto -> requestHeaderDto.getName() + ":" + requestHeaderDto.getValue())
            .collect(Collectors.joining(";"));
    }


}
