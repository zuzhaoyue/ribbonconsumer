package com.zzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zuzhaoyue on 2019/4/2.
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public Object getConsumer(){
        return restTemplate.getForEntity("http://HELLO-CLIENT-ZZY/hello",String.class).getBody();
    }

    @GetMapping
    public Object get(){
        return "hello";
    }
}
