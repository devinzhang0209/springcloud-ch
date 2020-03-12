package com.forezp.eureka_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 测试controller
 * @author: sunflower
 * @date: 2020-03-11 11:39
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;
    @GetMapping("hi")
    public String home(@RequestParam String name){
        return "你好 "+ name +", 我的端口是 : " +port;
    }

    @GetMapping("/testRest")
    public String testRest(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://www.baidu.com/",String.class);
    }

}
