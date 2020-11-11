package com.app.appmain.test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

@Mapper
public interface TestDao {

    public Map<String,Object> login(@Param("user") String user, @Param("pwd") String psw);
}
