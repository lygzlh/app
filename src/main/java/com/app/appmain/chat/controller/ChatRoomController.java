package com.app.appmain.chat.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ChatRoomController {

    @RequestMapping(value = "/chat/",method = RequestMethod.GET)
    public String chatIndex(){
        return "/chat/chatMain.html";
    }
}
