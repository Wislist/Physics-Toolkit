package com.bitzh.demo1.controller;

import com.bitzh.demo1.entity.*;
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
    //666

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

    @PostMapping("/k") // 5-10 计算斜率K 传入doubleB2和doubleH2
    public Float calculate_k(TestData testData) {
        Float k = dataService.calculate_k(testData);
        return k;
    }

    @PostMapping("/Bm") // 5-10 计算磁感应强度 传入 double Br和double K
    public Float calculate_Bm(TestData testData) {
        Float Bm = dataService.calculate_Bm(testData);
        return Bm;
    }

    @PostMapping("/Hm") // 5-10 计算磁场强度 需要传入double Bs和 double K
    public Float calculate_Hm(TestData testData) {
        Float Hm = dataService.calculate_Hm(testData);
        return Hm;
    }
    @PostMapping("/S") //5-10 计算磁滞回线面积 需要传入double Br和double Hc
    public Float calculate_S(TestData testData){
        Float S = dataService.calculate_S(testData);
        return S;
    }
    @PostMapping("/B1") //5-10 计算B1 需要传入double Y2 double Bm
    public Float calculate_B1(TestData testData){
        Float B1 = dataService.calculate_B1(testData);
        return B1;
    }
    @PostMapping("/B2") //5-10 计算B2 需要传入double Y2 double Bm
    public Float calculate_B2(TestData testData){
        Float B2 = dataService.calculate_B2(testData);
        return B2;
    }
    @PostMapping("/H") //5-10 计算H 需要传入double X double Hm
    public double calculate_H(TestData testData){
        Double H = dataService.calculate_H(testData);
        return H;
    }


    @PostMapping("/Vave") //5-4 求V的平均值 传入 double R 传入double F
    public double calculate_Vave(SoundSpeedData  soundSpeedData){
        return dataService.calculate_Vave(soundSpeedData);
    }
    @PostMapping("/Uv")  //v 的不确定度 传入double V double Ua double R
    public double calculate_Uv(SoundSpeedData soundSpeedData){
        return dataService.calculate_Uv(soundSpeedData);
    }

    @PostMapping("/Ua") //声速这一章的 Ua 不确定度 传入double[] L
    public double calculate_Ua(SoundSpeedData soundSpeedData){
        return dataService.calculate_Ua(soundSpeedData);
    }


    //5-4 从前端获取数组 并存入实体类中的X


    @PostMapping("/Rb")//用于计算红光平均值（只用传入测量次数restNum和测量数据的数组testDate）
    public double calculate_Rb(int testNum,double[] testData){
        return dataService.calculate_Rb(testNum,testData);
    }

    @PostMapping("/Ubo")//计算波长的不确定度（只用传入测量次数restNum和测量数据的数组testDate）
    public double calculate_Ubo(int testNum,double[] testData){
        return dataService.calculate_Ubo(testNum,testData);
    }

    @PostMapping("/PNJunction")//估算被测PN结材料的禁带宽(//起始温度压降 double Vfts//实验起始温度 double ts//温度变化的灵敏度 double K）
    public double calculate_PnJ(PN_Junction pn_junction){
        return dataService.calculate_Eg(pn_junction);
    }
    @PostMapping("/calculate_Lave")//计算Li的平均值（只用传入测量次数restNum和测量数据的数组testDate）
    public Double calculate_Lave(int testNum, double[] testData){
        return dataService.calculate_Lave(testNum,testData);
    }
    @PostMapping("/calculate_R")//计算LAMDA的平均值（只用传入测量次数restNum和测量数据的数组testDate）
    public Double calculate_R(int testNum, double[] testData){
        return dataService.calculate_R(testNum,testData);
    }
    @PostMapping("/calculate_K")
    public double[] calculate_LS(LeastSquares leastSquares){
        return dataService.calculate_LS(leastSquares);
    }
}