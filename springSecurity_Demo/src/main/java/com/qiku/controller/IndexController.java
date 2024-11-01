package com.qiku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    private String name;
    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }
    @GetMapping("/login")
    @ResponseBody
    public String getList(){
        System.out.println("老弟进来了");
        return "index";
    }

}
