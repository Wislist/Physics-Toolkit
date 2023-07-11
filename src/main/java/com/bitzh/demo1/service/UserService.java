package com.bitzh.demo1.service;

import com.bitzh.demo1.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: oyy0v0
 * @Date: 2023/7/10 - 07 - 10 - 8:56
 * @Description: com.bitzh.demo1.service
 * @version: 1.0
 */
@Repository
public interface UserService {
    List<User> findAllUser();
    void addUser(User user);
    void deleteUser(Integer id);

}
