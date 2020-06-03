package com.hc.controller;

import com.hc.bean.Dept;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/t1")
public class ThymeLeafController1 {
    @GetMapping("/demo1")
    public String demo1(Model model){
        model.addAttribute("info", "大家好！");
        return "demo1";
    }

    @RequestMapping("/demo2")
    public String demo2(ModelMap modelMap) {
        modelMap.put("thText", "th:text 设置文本内容 <b>加粗</b>");
        modelMap.put("thUText", "th:utext 设置文本内容 <b>加粗</b>");
        modelMap.put("thValue", "thValue 设置当前元素的value值");
        modelMap.put("thEach", Arrays.asList("张三","李四","王二","麻子"));
        modelMap.put("thIf", "msg is not null");
        modelMap.put("thObject", new Dept(10, "Sales", "CHICAGO"));
        return "demo2";
    }

    @RequestMapping("demo3")
    public String demo3(ModelMap modelMap) {
        modelMap.put("itStr", "HelloWorld");
        modelMap.put("itNum", 888.888D);
        modelMap.put("itBool", true);
        modelMap.put("itArray", new Integer[]{1,2,3,4});
        modelMap.put("itList", Arrays.asList(1,3,2,4,0));
        Map itMap = new HashMap();
        itMap.put("thName", "${#...}");
        itMap.put("desc", "变量表达式内置方法");
        modelMap.put("itMap", itMap);
        modelMap.put("itDate", new Date());
        return "demo3";
    }

    @RequestMapping("/demo4")
    public String demo4(ModelMap modelMap) {
        modelMap.addAttribute("message", "http://www.hcshow.online");
        return "demo4";
    }
    @RequestMapping("/demo5")
    public String demo5(ModelMap modelMap) {
        modelMap.addAttribute("userName", "hcshow");
        return "demo5";
    }
}
