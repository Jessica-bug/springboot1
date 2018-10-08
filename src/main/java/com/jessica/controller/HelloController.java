package com.jessica.controller;

import com.jessica.domain.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guanyiting on 2018/6/11 0011.
 * desc:
 */
@RestController()
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private UserProperties userProperties;

    @Value("${content}")
    private String content;

    @RequestMapping("/")
    public String index(){
        return "new Create SpringBoot Application.";
    }

    @RequestMapping("/getUser")
    public String getUser(){
        return "names:"+userProperties.getNames()+"<br>age:"+userProperties.getAge();
    }

    @RequestMapping("/printContent")
    public String printContent(){
        return content;
    }
}
