package com.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("/say")
    public String say(){
        return "/say";
    }

    @RequestMapping("/sayName")
    public String sayName(Model model){
        model.addAttribute("name","zhang");
        model.addAttribute("url","http://www.cnblogs.com/wormday/p/8435617.html");
        return "/sayName";
    }
}
