package com.bitzh.demo1.service.impl;

import com.bitzh.demo1.entity.TestData;
import com.bitzh.demo1.service.DataService;
import org.springframework.stereotype.Service;

/**
 * @Auther: oyy0v0
 * @Date: 2023/7/11 - 07 - 11 - 15:47
 * @Description: com.bitzh.demo1.service.impl
 * @version: 1.0
 */
@Service
public class dataServiceImpl implements DataService {
    @Override
    public Float calculate_k(TestData testData){
        Float K = (testData.getB2()-testData.getB1())/(testData.getH2()-testData.getH1());
        return K;
    }
    @Override
    public Float calculate_Bm(TestData testData){
        Float Bm = (testData.getBr()-testData.getB1())/testData.getK()+ testData.getH1();
        return Bm;
    }
    @Override
    public Float calculate_Hm(TestData testData){
        Float Hm = (testData.getBs()-testData.getB1())/testData.getK()+testData.getH1();
        return Hm;
    }

}
