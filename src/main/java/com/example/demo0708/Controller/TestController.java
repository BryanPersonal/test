package com.example.demo0708.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/")
    public String sayHello(){

        return "This project is built for success";
    }

}
