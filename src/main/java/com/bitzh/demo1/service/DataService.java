package com.bitzh.demo1.service;

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
     * 计算声速
     */
    Double getF(SoundSpeedData soundSpeedData);
    double[] calculate_Li(SoundSpeedData soundSpeedData);
    Double calculate_V(SoundSpeedData soundSpeedData);
    Double calculate_Ua(SoundSpeedData soundSpeedData);//计算不确定度
    Double calculate_Lave(SoundSpeedData soundSpeedData);//计算Li的平均值
    Double calculate_R(SoundSpeedData soundSpeedData);
    Double calculate_Vave(SoundSpeedData soundSpeedData);//V的平均值
    Double calculate_Uv(SoundSpeedData soundSpeedData);//V的不确定度
}


