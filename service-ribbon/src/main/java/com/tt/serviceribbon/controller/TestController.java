package com.tt.serviceribbon.controller;

import com.tt.serviceribbon.service.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author TT
 */
@RestController
public class TestController {
    @Resource
    private Test test;

    @GetMapping("/hi")
    public String hiService(@RequestParam String name){
        return test.hiService(name);
    }

}
