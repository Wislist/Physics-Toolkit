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

    @Override
    public Float calculate_SoundSpeed(SoundSpeedData soundSpeedData) {
        return null;
    }

    @Override
    public Double getF(SoundSpeedData soundSpeedData) {
        return null;
    }


    /**
     * by Wislist
     *
     * @return
     */


    @Override
    public Double calculate_Li() {
        return 1.0;
    }

    @Override
    public Double calculate_V(SoundSpeedData soundSpeedData) {
        return null;
    }


    @Override
    public Double calculate_Ua(SoundSpeedData soundSpeedData) {
        double[] Li = new double[6];
        double Sum = 0;
        for (int i=0;i<6;i++){
            Sum = Math.pow(Li[i]-soundSpeedData.getL_ave(),2);
        }
        return Math.sqrt(Sum/11)/3;
    }

    @Override
    public Double calculate_Lave(SoundSpeedData soundSpeedData) {
        double ave = 0;
        double[] doubles = new double[6];
        doubles = soundSpeedData.getL();
        for (int i=0;i<6;i++){
            ave = doubles[i];
        }
        return ave;
    }

    @Override
    public Double calculate_R(SoundSpeedData soundSpeedData) {
        return null;
    }

    @Override
    public Double calculate_Vave(SoundSpeedData soundSpeedData) {
        return null;
    }

    @Override
    public Double calculate_Uv(SoundSpeedData soundSpeedData) {
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
            x = leastSquares.getX();
        return x;
    }

}
