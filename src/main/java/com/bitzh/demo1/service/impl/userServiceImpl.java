package com.bitzh.demo1.service.impl;

import com.bitzh.demo1.dao.UserDao;
import com.bitzh.demo1.entity.User;
import com.bitzh.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: oyy0v0
 * @Date: 2023/7/10 - 07 - 10 - 8:57
 * @Description: com.bitzh.demo1.service.impl
 * @version: 1.0
 */
@Service
public class userServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAllUser() {
        List<User> allUser = userDao.findAllUser();
        return allUser;
    }
    @Override
    public void addUser(User user){
        userDao.addUser(user);

    }
    @Override
    public void deleteUser(Integer id){
        userDao.deleteUser(id);
    }

}
