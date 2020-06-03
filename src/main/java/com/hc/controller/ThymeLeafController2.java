package com.hc.controller;

import com.hc.bean.Dept;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/t2")
public class ThymeLeafController2 {
    @RequestMapping("/if")
    public String ifunless(ModelMap modelMap) {
        modelMap.addAttribute("flag", "no");
        return "if";
    }

    @RequestMapping("/list")
    public String list(ModelMap modelMap) {
        modelMap.addAttribute("depts", getDeptList());
        return "list";
    }

    @RequestMapping("/url")
    public String url(ModelMap modelMap) {
        modelMap.addAttribute("t", "link");
        modelMap.addAttribute("pid", "springcloud/2017/09/11/");
        modelMap.addAttribute("img", "http://www.ityouknow.com/assets/images/neo.jpg");
        return "url";
    }

    @RequestMapping("/eq")
    public String eq(ModelMap modelMap) {
        modelMap.addAttribute("name", "zhangsan");
        modelMap.addAttribute("age", 30);
        modelMap.addAttribute("gender", "male");
        return "eq";
    }

    @RequestMapping("/switch")
    public String switchcase(ModelMap modelMap) {
        modelMap.addAttribute("sex", "woman");
        return "switch";
    }

    private List<Dept> getDeptList() {
        List<Dept> list = new ArrayList<Dept>();
        Dept user1 = new Dept(111, "aaa", "aaa");
        Dept user2 = new Dept(222, "bbb", "bbb");
        Dept user3 = new Dept(333, "ccc", "ccc");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }

}
