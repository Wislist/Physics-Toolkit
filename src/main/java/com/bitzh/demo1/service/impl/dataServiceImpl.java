//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.bitzh.demo1.service.impl;

import com.bitzh.demo1.entity.LeastSquares;
import com.bitzh.demo1.entity.SoundSpeedData;
import com.bitzh.demo1.entity.TestData;
import com.bitzh.demo1.service.DataService;
import org.springframework.stereotype.Service;

import static java.lang.Math.sqrt;

@Service
public class dataServiceImpl implements DataService {
    double Pi = 3.14159;

    public dataServiceImpl() {
    }

    public Float calculate_k(TestData testData) {
        Float K = testData.getB2() / testData.getH2();
        return K;
    }

    public Float calculate_Bm(TestData testData) {
        Float Bm = testData.getBr() / testData.getK();
        return Bm;
    }

    public Float calculate_Hm(TestData testData) {
        Float Hm = testData.getBs() / testData.getK();
        return Hm;
    }

    public Float calculate_S(TestData testData) {
        Float S = 4.0F * testData.getBr() * testData.getHc();
        return S;
    }

    public Float calculate_SoundSpeed(SoundSpeedData soundSpeedData) {
        return null;
    }

    public Double getF(SoundSpeedData soundSpeedData) {
        return null;
    }

    public Double calculate_Li() {
        return 1.0;
    }

    public Double calculate_V(SoundSpeedData soundSpeedData) {
        return null;
    }

    public Double calculate_Ua(SoundSpeedData soundSpeedData) {
        double[] Li = new double[6];
        double Sum = 0.0;

        for(int i = 0; i < 6; ++i) {
            Sum = Math.pow(Li[i] - soundSpeedData.getL_ave(), 2.0);
        }

        return sqrt(Sum / 11.0) / 3.0;
    }

    public Double calculate_Lave(SoundSpeedData soundSpeedData) {
        double ave = 0.0;
        double[] doubles = new double[6];
        doubles = soundSpeedData.getL();

        for(int i = 0; i < 6; ++i) {
            ave = doubles[i];
        }

        return ave;
    }

    public Double calculate_R(SoundSpeedData soundSpeedData) {
        return null;
    }

    public Double calculate_Vave(SoundSpeedData soundSpeedData) {
        return null;
    }

    public Double calculate_Uv(SoundSpeedData soundSpeedData) {
        return null;
    }

    public Float calculate_B1(TestData testData) {
        Float B1 = (testData.getY1() - 4.0F) / 5.0F * testData.getBm();
        return B1;
    }

    public Float calculate_B2(TestData testData) {
        Float B2 = (testData.getY2() + 4.0F) / 5.0F * testData.getBm();
        return B2;
    }

    public Double calculate_H(TestData testData) {
        double H = (double)(testData.getX() / 10.0F * testData.getHm());
        return H;
    }

    public double[] calculate_LS(LeastSquares leastSquares) {
        double x_sum = 0.0;
        double y_sum = 0.0;
        double x_avg = 0.0;
        double y_avg = 0.0;
        double xy_sum = 0.0;
        double x_x = 0.0;
        double b = 0.0;
        double a = 0.0;
        double[] x = leastSquares.getX();
        double[] y = leastSquares.getY();

        int i;
        for(i = 0; i < leastSquares.getNum(); ++i) {
            x_sum += x[i];
            y_sum += y[i];
        }

        x_avg = x_sum / (double)leastSquares.getNum();
        y_avg = y_sum / (double)leastSquares.getNum();

        for(i = 0; i < leastSquares.getNum(); ++i) {
            xy_sum += x[i] * y[i];
        }

        for(i = 0; i < leastSquares.getNum(); ++i) {
            x_x += x[i] * x[i];
        }

        b = (xy_sum - (double)leastSquares.getNum() * x_avg * y_avg) / (x_x - (double)leastSquares.getNum() - x_avg * x_avg);
        a = y_avg - b * x_avg;
        return new double[]{a};
    }



    //计算平均值(需要传入测验次数，测验数据的数组)
    /*
    * testNum:测量次数
    * testData【】: 测量数据的数组
    * 将数组求和除以测量次数
    *
    * */
    @Override
    public Double calculate_ave(int testNum, double[] testData){
        Double result = null;
        double sum = 0;
        for(int i = 0 ;i < testNum;i++) {
            sum += testData[i];
        }
        result = sum / testNum;
        return result;
    }
    //计算Ua不确定度的通用方法(需要传入测验次数，测验数据的数组）
    /*
    * testNum:测量次数
    * testData【】: 测量数据的数组
    * 原理：先将数据求平均值，然后将每个数据减去平均值然后平方，求和，除以测验次数-1，然后将所有开方
    *
    * */
    @Override
    public Double calculate_Ua(int testNum,double[] testData){
        Double result = null;
        double ave = calculate_ave(testNum,testData);
        int sum = 0;
        for(int i = 0; i < testNum;i++){
            sum += (testData[i]-ave);
        }
        sum /= testNum - 1;
        result = sqrt(sum);
        return result;
    }
}
