package com.bitzh.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * date:23.7.12
 * 计算最小二乘法
 * created by Murphy.
 */
public class LeastSquares {
    int num; // 累加次数;
    double[] x;//系数x;
    double[] y;//系数y;
    double x_avg; //系数x的平均值;
    double y_avg; //系数y的平均值;
    double b; //系数b;
    double a; //系数a;
}
