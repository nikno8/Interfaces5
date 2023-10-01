package com.example.practice5interfaces.controllrer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    @GetMapping("/")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @GetMapping("/update")
    public String update(){
        return "update";
    }

}
