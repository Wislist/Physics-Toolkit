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
    Float calculate_SoundSpeed(SoundSpeedData soundSpeedData);
}
