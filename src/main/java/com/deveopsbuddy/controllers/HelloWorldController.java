package com.deveopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 4/15/2017.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello()
    {
        return  "index";
    }
}
