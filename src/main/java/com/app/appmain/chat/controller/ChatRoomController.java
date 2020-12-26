package com.app.appmain.chat.controller;


import com.app.appmain.chat.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ChatRoomController {

    @Autowired
    ChatRoomService chatRoomService;

    /**
     * 聊天记录首页
     * @return
     */
    @RequestMapping(value = "/chat/",method = RequestMethod.GET)
    public String chatIndex(){
        return "/chat/chatMain.html";
    }

    /**
     * 验证登录状态
     * @return
     */
    @RequestMapping(value = "/chat/isLogin")
    public String isLogin(){
        return "";
    }

    /**
     * 聊天登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/chat/login",method = RequestMethod.POST)
    public String chatLogin(@RequestParam("username") String username,@RequestParam("password") String password){
        if(chatRoomService.login(username, password)!=null){
            return "redirect:/chat/";
        }else {
            return "redirect:/";
        }

    }
}
