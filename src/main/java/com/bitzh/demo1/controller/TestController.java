package com.bitzh.demo1.controller;

import com.bitzh.demo1.entity.LeastSquares;
import com.bitzh.demo1.entity.SoundSpeedData;
import com.bitzh.demo1.entity.TestData;
import com.bitzh.demo1.entity.User;
import com.bitzh.demo1.service.DataService;
import com.bitzh.demo1.service.UserService;
import org.apache.coyote.Response;
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
    public List<User> getAllUser() {
        List<User> allUser = userService.findAllUser();
        return allUser;
    }

    @PostMapping("/test2")
    public void addUser(User user) {
        userService.addUser(user);
    }

    @PostMapping("/test3")
    public void deleteUser(Integer id) {
        userService.deleteUser(id);
    }

    @PostMapping("/k") // 5-10 计算斜率K
    public Float calculate_k(TestData testData) {
        Float k = dataService.calculate_k(testData);
        return k;
    }

    @PostMapping("/Bm") // 5-10 计算磁感应强度
    public Float calculate_Bm(TestData testData) {
        Float Bm = dataService.calculate_Bm(testData);
        return Bm;
    }

    @PostMapping("/Hm") // 5-10 计算磁场强度
    public Float calculate_Hm(TestData testData) {
        Float Hm = dataService.calculate_Hm(testData);
        return Hm;
    }
    @PostMapping("/S") //5-10 计算磁滞回线面积
    public Float calculate_S(TestData testData){
        Float S = dataService.calculate_S(testData);
        return S;
    }
    @PostMapping("/B1") //5-10 计算B1
    public Float calculate_B1(TestData testData){
        Float B1 = dataService.calculate_B1(testData);
        return B1;
    }
    @PostMapping("/B2") //5-10 计算B2
    public Float calculate_B2(TestData testData){
        Float B2 = dataService.calculate_B2(testData);
        return B2;
    }
    @PostMapping("/H") //5-10 计算H
    public double calculate_H(TestData testData){
        Double H = dataService.calculate_H(testData);
        return H;
    }


    @PostMapping("/Li")
    public String calculate_Li(@RequestBody Double[] X){
        Double x = dataService.calculate_Li();
        return null;
    }
    @PostMapping({"/LeastSquares"})
    public double[] calculate_LS(LeastSquares leastSquares) {
        double[] X = this.dataService.calculate_LS(leastSquares);
        return X;
    }

    @PostMapping("/Rb")//用于计算红光平均值（只用传入测量次数和测量数据的数组）
    public double calculate_Rb(int testNum,double[] testData){
        return dataService.calculate_Rb(testNum,testData);
    }
}

//666666