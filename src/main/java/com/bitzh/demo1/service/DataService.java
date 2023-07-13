package com.bitzh.demo1.service;

import com.bitzh.demo1.entity.LeastSquares;
import com.bitzh.demo1.entity.PN_Junction;
import com.bitzh.demo1.entity.SoundSpeedData;
import com.bitzh.demo1.entity.TestData;
import org.springframework.stereotype.Repository;

/**
 * @Auther: oyy0v0
 * @Date: 2023/7/11 - 07 - 11 - 15:46
 * @Description: com.bitzh.demo1.service
 * @version: 1.0
 */
@Repository
public interface DataService {
    Float calculate_k(TestData testData);//计算斜率K;
    Float calculate_Bm(TestData testData);

    Float calculate_Hm(TestData testData);
    Float calculate_S(TestData testData);



    /**
     * 计算声速中的逐差法：Li=Xi+6 - Xi 单位：(mm)
     *
     */




    Double calculate_Ua(SoundSpeedData soundSpeedData);





    Double calculate_Vave(SoundSpeedData soundSpeedData);

    Double calculate_Uv(SoundSpeedData soundSpeedData);

    Float calculate_B1(TestData testData);

    Float calculate_B2(TestData testData);

    Double calculate_H(TestData testData);



    //计算平均值(需要传入测验次数，测验数据)
    Double calculate_ave(int testNum,double[] testData);
    //计算A类不确定度通用方法
    Double calculate_Ua(int testNum,double[] testData);
    //计算红光波长的平均值
    Double calculate_Rb(int testNum,double[] testData);

    //计算波长不确定度
    Double calculate_Ubo(int testNum,double[] testData);
    double[] calculate_LS(LeastSquares leastSquares);

    //估算被测PN结材料的禁带宽
    double calculate_Eg(PN_Junction pn_junction);

    Double calculate_Lave(int testNum, double[] testData);


    Double calculate_R(int testNum, double[] testData);
}
