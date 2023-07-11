package com.bitzh.demo1.dao;


import com.bitzh.demo1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: oyy0v0
 * @Date: 2023/7/10 - 07 - 10 - 8:32
 * @Description: com.bitzh.demo1.dao
 * @version: 1.0
 */
@Mapper //告诉springboot这是一个mybatis的mapper类
//@Repository //讲userdao交给spring容器管理
public interface UserDao {
    //查询所有用户
    List<User> findAllUser();
    Integer addUser(User user);
    int deleteUser(Integer id);
}
