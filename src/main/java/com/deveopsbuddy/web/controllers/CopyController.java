package com.deveopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 4/16/2017.
 */
@Controller
public class CopyController {
    @RequestMapping("/about")
    public String about() {
        return "copy/about";
    }
}
