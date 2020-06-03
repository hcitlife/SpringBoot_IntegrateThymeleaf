package com.hc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/t3")
public class ThymeleafController3 {

    @RequestMapping("/layout1")
    public String dashboard() {
        return "layout1/demo1";
    }

    @RequestMapping("/index")
    public String index() {
        return "layout2/index";
    }

    @RequestMapping("/fragment")
    public String fragment() {
        return "layout2/fragment";
    }

    @RequestMapping("/layout2")
    public String layout() {
        return "layout2/layout";
    }

    @RequestMapping("/home")
    public String home() {
        return "layout2/home";
    }

    @RequestMapping("/main")
    public String main() {
        return "layout0/main";
    }

}