package com.lgfei.osio.oauth.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/example")
public class ExampleController {

    @GetMapping("/get")
    public String get(){
        return "get request";
    }
}
