package com.app.appmain.test.service.Impl;

import com.app.appmain.test.dao.TestDao;
import com.app.appmain.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDao testDao;

    @Override
    public String login(String user, String pwd) {

        return testDao.login(user,pwd).toString();
    }
}
