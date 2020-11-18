package com.six.spring.cloud.feign.greeting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Builder
@Getter
@Setter
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class GreetingDto {

    @JsonProperty("who")
    String who;

    @JsonProperty("message")
    String message;

}
