package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/cast")
    public String cast(){
        return "cast";
    }

    @RequestMapping("/production")
    public String production(){
        return "production";
    }

    @RequestMapping("/music")
    public String music(){
        return "music";
    }

    @RequestMapping("/reception")
    public String reception(){
        return "reception";
    }

}
