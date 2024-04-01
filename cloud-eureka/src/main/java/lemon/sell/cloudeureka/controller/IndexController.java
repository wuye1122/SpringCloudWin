package lemon.sell.cloudeureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/e/a")
    public String index(){
        return "eureka";
    }
}
