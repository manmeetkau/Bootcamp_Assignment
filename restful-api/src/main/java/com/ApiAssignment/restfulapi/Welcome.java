package com.ApiAssignment.restfulapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "/hello")
public class Welcome {
    @GetMapping("")
    public String welcome_springboot(){
        return "Welcome to Sring boot";
    }
}
