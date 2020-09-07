package com.example.jobseekWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping(value = "/")
    public String testpage() {
        System.out.println("테스트입니다.");
        return "test";
    }
    
    @RequestMapping(value = "/jobList")
    public String testpage2() {
        System.out.println("jobList 페이지 입니다.");
        return "jobList";
    }
    
}
