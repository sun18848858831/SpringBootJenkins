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
        System.out.println("成功1");
        System.out.println("成功2");
        System.out.println("成功3");
        System.out.println("成功4");
        System.out.println("成功5");
        return "成功！";
    }

}
