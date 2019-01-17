package com.spring.boot.SpringBootFastTreaning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler2 {

    @RequestMapping("/page")
       public String method2(){
        return "hi";
    }



}
