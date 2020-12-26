package com.app.appmain.chat.service;

import java.util.HashMap;

public interface ChatRoomService {

    /**
     * 聊天登录
     * @param username
     * @param password
     * @return
     */
    HashMap<String,Object> login(String username, String password);
}
