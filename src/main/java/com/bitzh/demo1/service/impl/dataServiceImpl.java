package com.bitzh.demo1.service.impl;

import com.bitzh.demo1.entity.LeastSquares;
import com.bitzh.demo1.entity.SoundSpeedData;
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
    double Pi = 3.14159;
    @Override
    public Float calculate_k(TestData testData){
        Float K = (testData.getB2())/(testData.getH2());
        return K;
    }
    @Override
    public Float calculate_Bm(TestData testData){
        Float Bm = (testData.getBr())/testData.getK();
        return Bm;
    }
    @Override
    public Float calculate_Hm(TestData testData){
        Float Hm = (testData.getBs())/testData.getK();
        return Hm;
    }

    @Override
    public Float calculate_S(TestData testData) {
        Float S = 4 * testData.getBr() * testData.getHc();
        return S;
    }


    /**
     * by Wislist
     * @param soundSpeedData
     * @return
     */


    @Override
    public Double calculate_Li(SoundSpeedData soundSpeedData) {
        return null;
    }
    @Override
    public Float calculate_SoundSpeed(SoundSpeedData soundSpeedData) {
        return null;
    }
    @Override
    public Float calculate_B1(TestData testData){
        Float B1 = (testData.getY1()-4)/5*testData.getBm();
        return B1;
    }
    @Override
    public Float calculate_B2(TestData testData){
        Float B2 = (testData.getY2()+4)/5*testData.getBm();
        return B2;
    }@Override
    public Double calculate_H(TestData testData){
        double H = (testData.getX())/10*testData.getHm();
        return H;
    }
    @Override
    public double[] calculate_LS(LeastSquares leastSquares){
        double[] x = {0};
        //for(int i=0;i<3;i++){
            x = leastSquares.getX();
        //}
        return x;
    }

}
