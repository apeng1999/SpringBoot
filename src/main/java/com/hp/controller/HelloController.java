package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("say")
public class HelloController {

    @RequestMapping("hello")
    public  @ResponseBody  String sayHi(){
        return "HelloSpringBoot";
    }
}
