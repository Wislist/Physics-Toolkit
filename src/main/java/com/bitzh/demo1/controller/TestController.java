package com.bitzh.demo1.controller;

import com.bitzh.demo1.entity.TestData;
import com.bitzh.demo1.entity.User;
import com.bitzh.demo1.service.DataService;
import com.bitzh.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: oyy0v0
 * @Date: 2023/7/10 - 07 - 10 - 9:13
 * @Description: com.bitzh.demo1.controller
 * @version: 1.0
 */
@RequestMapping("/project")
@RestController
public class TestController {
    @Autowired
    private UserService userService;
    @Autowired
    private DataService dataService;
    @GetMapping("/test")
    public List<User> getAllUser(){
        List<User> allUser = userService.findAllUser();
        return allUser;
    }
    @PostMapping  ("/test2")
    public void addUser(User user){
        userService.addUser(user);
    }
    @PostMapping("/test3")
    public void deleteUser(Integer id){
        userService.deleteUser(id);
    }
    @PostMapping("/k")//计算斜率K
    public Float calculate_k(TestData testData){
        Float k = dataService.calculate_k(testData);
        return k;
    }
    @PostMapping("/Bm")//计算磁感应强度
    public Float calculate_Bm(TestData testData){
        Float Bm = dataService.calculate_Bm(testData);
        return Bm;
    }
    @PostMapping("Hm")//计算磁场强度
    public Float calculate_Hm(TestData testData){
        Float Hm = dataService.calculate_Hm(testData);
        return Hm;
    }

}