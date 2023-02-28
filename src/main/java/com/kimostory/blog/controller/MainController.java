package com.kimostory.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String main(@RequestParam( value="data", required = false) String data, Model model){
        model.addAttribute("data", data);
        return "index";
    }

}
