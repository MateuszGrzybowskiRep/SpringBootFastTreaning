package com.spring.boot.SpringBootFastTreaning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    @RequestMapping("/")
    public String Method(){
        return "HI";
    }
}
