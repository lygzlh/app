package com.app.appmain.chat.service.Impl;

import com.app.appmain.chat.dao.ChatRoomDao;
import com.app.appmain.chat.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ChatRoomServiceImpl implements ChatRoomService {

    @Autowired
    ChatRoomDao chatRoomDao;

    /**
     * 聊天登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public HashMap<String,Object> login(String username, String password) {
        HashMap<String,Object> userInfo = chatRoomDao.login(username, password);
        return userInfo;
    }
}
