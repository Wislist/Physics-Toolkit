package com.bitzh.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: oyy0v0
 * @Date: 2023/7/11 - 07 - 11 - 15:45
 * @Description: com.bitzh.demo1.entity
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestData {
    private Float B1;//P1的磁感应强度值
    private Float B2;//P2的磁感应强度值
    private Float H1;//P1的磁场强度值
    private Float H2;//P1的磁场强度值
    private Float K; //直线斜率
    private Float Hm;//最大电感
    private Float Bm;//最大磁感应强度
    private Float Br;//剩余磁感应强度
    private Float Bs;//磁感应强度
}
