package lemon.sell.cloudapigateway.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {

    @RequestMapping("/index")
    public String getIndex(){
        return "API-GATEWAY";
    }
}
