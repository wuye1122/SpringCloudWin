package com.example.moduleweb.controller;


import com.example.moduleapi.api.A;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/index")
    public String indexController(){
        A a = new A();
        a.setS("THis is test demo");
        return a.getS();
    }
}
