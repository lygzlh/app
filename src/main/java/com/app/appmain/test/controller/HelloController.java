package com.app.appmain.test.controller;


import com.app.appmain.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user,@RequestParam("pwd") String pwd){
        String text = testService.login(user,pwd);
        System.out.println(text);
        return "redirect:/index.html";
    }
}
