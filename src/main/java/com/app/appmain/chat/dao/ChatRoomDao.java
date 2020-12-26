package com.app.appmain.chat.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

@Mapper
public interface ChatRoomDao {
    /**
     * 聊天登录
     * @param username
     * @param password
     * @return
     */
    HashMap<String,Object> login(@Param("username") String username, @Param("password") String password);
}
