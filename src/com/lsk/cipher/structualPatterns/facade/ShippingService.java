package com.lsk.cipher.structualPatterns.facade;

/**
 * @Author:六月的雨
 * @Date:2021/2/12 20:36
 * @PackageName:21hj com.lsk.cipher.structualPatterns.facade
 * @Description: 物流服务
 */
public class ShippingService {
    public boolean delivery(Gift gift){
        System.out.println(gift.getName()+"发货成功");
        return true;
    }
}
