package com.tt.serviceribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * @author TT
 */
@Service
public class Test {

    @Resource
    private RestTemplate restTemplate;


    public String hiService(String name){
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }
}
