package lemon.sell.cloudclient.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/z")
public class IndexController {


    @RequestMapping("/a")
    public String getIndex(){
        return "cloud-zuul";
    }

    @RequestMapping("/b")
    public String getIndex1(){
        return "cloud-zuul1";
    }
}
