package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/selectToString")
    public String selectToString() {
        System.out.println("成功！");
        System.out.println("成功！");
        System.out.println("成功！");
        return "成功！";
    }

}
