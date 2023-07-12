package com.bitzh.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * by Wislist
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoundSpeedData {
    //不确定度Ua
    private double Ua;
    //波长 朗木达
    private double R;
    //频率 一开始就给定的
    private double F;
    //用数组记录位置  注意表一表二因为都用的是同一种方法
    // 所以用同一个数组来处理不同的事务
    private double[] X;
    //记录结果
    private double[] L;
    //声速 计算方法为：V=R*F
    private double V;
    //声速的不确定度
    private double Uv;
}
