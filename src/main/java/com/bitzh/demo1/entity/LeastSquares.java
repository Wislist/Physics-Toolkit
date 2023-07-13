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
    private double[] x;//系数x;
    private double[] y;//系数y;
}
