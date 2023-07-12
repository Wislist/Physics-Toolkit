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
        double[] x;
        double[] y;
        double x_sum=0,y_sum=0,x_avg=0,y_avg=0,xy_sum=0,x_x=0,b=0,a=0;
            x = leastSquares.getX();
            y = leastSquares.getY();
            for (int i=0;i<leastSquares.getNum();i++){      //xy分别的和
                x_sum+=x[i];
                y_sum+=y[i];
            }
            x_avg=x_sum/leastSquares.getNum();              //xy的平均值
            y_avg=y_sum/leastSquares.getNum();
            for (int i=0;i<leastSquares.getNum();i++){      //xy的积累加
                xy_sum += x[i]*y[i];
            }
            for (int i=0;i<leastSquares.getNum();i++){      //x^2的累加
                x_x += x[i]*x[i];
            }
            b=(xy_sum-leastSquares.getNum()*x_avg*y_avg)/(x_x-leastSquares.getNum()-x_avg*x_avg);  //计算b
        a=y_avg-b*x_avg;
        return new double[]{a};
    }

}
