package com.bitzh.demo1.service;

import com.bitzh.demo1.entity.LeastSquares;
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

    Float calculate_SoundSpeed(SoundSpeedData soundSpeedData);

    /**
     * 计算声速中的逐差法：Li=Xi+6 - Xi 单位：(mm)
     *
     */


    Double calculate_V(SoundSpeedData soundSpeedData);

    Double calculate_Ua(SoundSpeedData soundSpeedData);

    Double calculate_Lave(SoundSpeedData soundSpeedData);

    Double calculate_R(SoundSpeedData soundSpeedData);

    Double calculate_Vave(SoundSpeedData soundSpeedData);

    Double calculate_Uv(SoundSpeedData soundSpeedData);

    Float calculate_B1(TestData testData);

    Float calculate_B2(TestData testData);

    Double calculate_H(TestData testData);

    Double calculate_Li();
    double[] calculate_LS(LeastSquares leastSquares);

    //计算平均值(需要传入测验次数，测验数据)
    Double calculate_ave(int testNum,double[] testData);
    Double calculate_Ua(int testNum,double[] testData);
}

//te
